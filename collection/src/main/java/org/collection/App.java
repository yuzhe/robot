package org.collection;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Document doc = Jsoup.connect("http://www.baidu.com/").get();
    	String title = doc.title();
    	System.out.println(title);
    }
}
