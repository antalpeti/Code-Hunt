package codehunt.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import codehunt.sector00.Sector00Test;
import codehunt.sector01.Sector01Test;
import codehunt.sector02.Sector02Test;
import codehunt.sector03.Sector03Test;
import codehunt.sector04.Sector04Test;
import codehunt.sector05.Sector05Test;
import codehunt.sector06.Sector06Test;
import codehunt.sector07.Sector07Test;
import codehunt.sector08.Sector08Test;
import codehunt.sector09.Sector09Test;
import codehunt.sector10.Sector10Test;
import codehunt.sector11.Sector11Test;
import codehunt.sector12.Sector12Test;
import codehunt.sector13.Sector13Test;
import codehunt.sector14.Sector14Test;

@RunWith(Suite.class)
@SuiteClasses({Sector00Test.class, Sector01Test.class, Sector02Test.class, Sector03Test.class,
  Sector04Test.class, Sector05Test.class, Sector06Test.class, Sector07Test.class,
  Sector08Test.class, Sector09Test.class, Sector10Test.class, Sector11Test.class,
  Sector12Test.class, Sector13Test.class, Sector14Test.class})
public class AllTests {

}
