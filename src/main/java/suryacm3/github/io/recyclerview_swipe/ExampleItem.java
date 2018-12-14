package suryacm3.github.io.recyclerview_swipe;


public class ExampleItem {
    private int mimage;
    private String mtext1;
    private String mtext2;
    public ExampleItem(int image,String text1,String text2){
        mimage=image;
        mtext1=text1;
        mtext2=text2;
    }
    public int getImage() {
        return mimage;
    }


    public String getText1() {
        return mtext1;
    }

    public String getText2() {
        return mtext2;
    }
}
