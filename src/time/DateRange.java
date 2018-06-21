package time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public enum DateRange {

    TODAY("Today"),
    YESTERDAY("Yesterday"),
    LAST_7_DAYS("Last 7 Days"),
    LAST_WEEK("Last Week"),
    LAST_30_DAYS("Last 30 Days"),
    LAST_MONTH("Last Month"),
    CUSTOME_RANGE("Custome Range");

    private String formatStart = "E LLL d 00:00:00 yyyy";
    private String formatEnd = "E LLL d 23:59:59 yyyy";
    private Locale locale =  Locale.US;

    private String name;

    DateRange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String getCurrentEndDateRange(String format, Locale locale) {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(format).localizedBy(locale));
    }

    public String getStartDateRange() {

        switch (this) {
            case TODAY:
               return getCurrentEndDateRange(formatStart, locale);

            case YESTERDAY:
                return LocalDateTime.now().minusDays(1)
                        .format(DateTimeFormatter.ofPattern(formatStart).localizedBy(locale));

            case LAST_7_DAYS:
                return LocalDateTime.now().minusDays(6)
                        .format(DateTimeFormatter.ofPattern(formatStart).localizedBy(locale));

            case LAST_WEEK:
                return LocalDateTime.now().minusWeeks(2).with(DayOfWeek.SUNDAY)
                        .format(DateTimeFormatter.ofPattern(formatStart).localizedBy(locale));

            case LAST_30_DAYS:
                return LocalDateTime.now().minusDays(29)
                        .format(DateTimeFormatter.ofPattern(formatStart).localizedBy(locale));

            case LAST_MONTH:
                return LocalDateTime.now().minusMonths(1).withDayOfMonth(1)
                        .format(DateTimeFormatter.ofPattern(formatStart).localizedBy(Locale.US));

            default:
                return null;

        }
    }

    public String getEndDateRange() {

        switch (this) {
            case TODAY:
                return getCurrentEndDateRange(formatEnd, locale);

            case YESTERDAY:
                return LocalDateTime.now().minusDays(1)
                        .format(DateTimeFormatter.ofPattern(formatEnd).localizedBy(locale));

            case LAST_7_DAYS:
                return getCurrentEndDateRange(formatEnd, locale);

            case LAST_WEEK:
                return LocalDateTime.now().minusWeeks(1).with(DayOfWeek.SATURDAY)
                        .format(DateTimeFormatter.ofPattern(formatEnd).localizedBy(locale));

            case LAST_30_DAYS:
                return getCurrentEndDateRange(formatEnd, locale);

            case LAST_MONTH:
                return LocalDateTime.now().minusMonths(1).withDayOfMonth(1).plusMonths(1).minusDays(1)
                        .format(DateTimeFormatter.ofPattern(formatEnd).localizedBy(Locale.US));

            default:
                return null;

        }
    }

    public long get() {
        return Duration.between(LocalDateTime.now(), LocalDateTime.now().plusMonths(1)).toSeconds();
    }


    public String getDateRange() {
        return getStartDateRange() + " - " + getEndDateRange();
    }
}




