/**
 * Created by kebas on 28.04.2016.
 */
public class NewReleasePrice extends Price
{
    @Override
    int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented){
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented)
    {
        return (daysRented > 1) ? 2: 1;
    }
}
