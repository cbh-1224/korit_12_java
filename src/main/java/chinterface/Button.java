package chinterface;

public abstract class Button implements Down, Up, Press{

    @Override
    public void onDown() {}

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {}
}
