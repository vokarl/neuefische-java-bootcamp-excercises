package ecosystem.enumOptional;

public record Person(
        int id,
        String name,
        DaysOfWeek favouriteDay
) {
    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public DaysOfWeek favouriteDay() {
        return favouriteDay;
    }


}
