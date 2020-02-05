library(dplyr)
library(ggplot2)

data <- read.csv("data/all_performance_event_profiles.csv")

# Find when the spikes occur according to L2_RQSTS:CODE_RD_MISS event
spikes <- data %>%
  filter(metrics == "L2_RQSTS:CODE_RD_MISS", value > 200) %>%
  pull(time)

# Plot all metrics on one sheet
p <- ggplot(data, aes(x=time, y=value)) +
  geom_vline(xintercept = spikes, lty="dotted", colour="red", size=0.75, alpha=0.5) +
  geom_line() +
  facet_grid(metrics~., scales="free_y") +
  theme(strip.text.y = element_text(angle=0),
        plot.subtitle = element_text(family = "mono")) +
  ggtitle("Performance event profiles") +
  labs(subtitle = "sqrt(A(1:LEN_1D)) + B .* C(1:LEN_1D)") +
  xlab("Retired instructions (INST_RETIRED:ANY_P)") +
  ylab("Performance event values")

# Make it big!
plot_width <- 10
plot_heigth <- 120
ggsave("plots/performance_event_profiles.pdf", p, width = plot_width, height = plot_heigth, limitsize = FALSE)

## Plot only two PEPs now
two_peps <- data %>%
  filter(metrics %in% c("L2_RQSTS:ALL_CODE_RD", "MEM_LOAD_RETIRED:L2_HIT", "SW_PREFETCH_ACCESS:PREFETCHW")) %>%
  mutate(metrics = factor(metrics, labels=c("L2_RQSTS:ALL_CODE_RD\n(good)", "MEM_LOAD_RETIRED:L2_HIT\n(bad)", "SW_PREFETCH_ACCESS:PREFETCHW\n(very bad)")))

p <- ggplot(two_peps, aes(x=time, y=value)) +
  geom_vline(xintercept = spikes, lty="dotted", colour="red", size=0.75, alpha=0.5) +
  geom_line() +
  facet_grid(metrics~., scales="free_y") +
  theme(strip.text.y = element_text(angle=0),
        plot.subtitle = element_text(family = "mono")) +
  ggtitle("Detection of instruction blocks with performance event profiles") +
  labs(subtitle = "sqrt(A(1:LEN_1D)) + B .* C(1:LEN_1D)") +
  xlab("Retired instructions (INST_RETIRED:ANY_P)") +
  ylab("Performance event values")

plot_width <- 10
plot_heigth <- 4
ggsave("plots/detection_with_performance_event_profiles.pdf", p, width = plot_width, height = plot_heigth)
