import com.devbadger.ConfigApp
import spock.lang.Specification

/**
 * Created by Badger on 6/8/18.
 */
class ConfigAppSpec extends Specification{

    def "Application context git backend loads successfully"(){
        expect: ConfigApp.main(["--spring.profiles.active=test"] as String[])
    }
}
