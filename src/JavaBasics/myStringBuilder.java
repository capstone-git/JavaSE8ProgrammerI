package JavaBasics;

public class myStringBuilder {

    StringBuilder sb = new StringBuilder(10);

    {
        sb.append("Java");
        sb.insert(1,"Java");
        sb.replace(1,3,"Java");
        sb.delete(1,3);
        sb.deleteCharAt(1);
        sb.reverse();
        sb.capacity();//default 16
        sb.lastIndexOf("abc");
    }


}
