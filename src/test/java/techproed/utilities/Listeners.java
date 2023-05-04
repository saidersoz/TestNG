package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("onStart() ==> Tüm testlerden önce bir kez çalışır.(Class'dan önce)");
    }

    public void onFinish(ITestContext context){
        System.out.println("onFinish() ==> Tüm testlerden sonra bir kez çalışır.(Class'dan sonra)");
    }
}
