package ecosystem.enumOptional;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY ,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

public String weekDayChecker(){
        if (this == SATURDAY || this == SUNDAY){
            return "Weekend";
        }else{
            return this.name();
        }
}
}
