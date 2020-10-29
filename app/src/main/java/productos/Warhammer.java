package productos;

import android.view.View;

public class Warhammer{

    //Definir datos

    private int w01;
    private int w02;
    private int w03;
    private int w04;
    private int w05;

    //Constructores
    public Warhammer()
    {
    w01 = 16990;
    w02 = 20000;
    w03 = 19990;
    w04 = 25000;
    w05 = 32000;
    }

    // get
    public int getW01() {
        return w01;
    }
    public int getW02() {
        return w02;
    }
    public int getW03() {
        return w03;
    }
    public int getW04() {
        return w04;
    }
    public int getW05() { return w05; }
}
