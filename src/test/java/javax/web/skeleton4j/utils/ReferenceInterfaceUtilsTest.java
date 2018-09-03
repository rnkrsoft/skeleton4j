package javax.web.skeleton4j.utils;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by rnkrsoft.com on 2017/11/23.
 */
public class ReferenceInterfaceUtilsTest {

    @Test
    public void testGetRefInterface() throws Exception {
        String[] str1 = ReferenceInterfaceUtils.parse("doing1=com.rnkrsoft.skeleton.doing1:1.0.0");
        System.out.println(Arrays.toString(str1));
        String[] str2 = ReferenceInterfaceUtils.parse("doing1=com.rnkrsoft.skeleton.doing1");
        System.out.println(Arrays.toString(str2));
        String[] str3 = ReferenceInterfaceUtils.parse("com.rnkrsoft.skeleton.doing1:1.0.0");
        System.out.println(Arrays.toString(str3));
        String[] str4 = ReferenceInterfaceUtils.parse("com.rnkrsoft.skeleton.doing1");
        System.out.println(Arrays.toString(str4));
    }
}