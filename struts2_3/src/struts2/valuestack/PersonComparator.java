package struts2.valuestack;

import java.util.Comparator;

/**
 * @author 孟享广
 * @date 2020-11-06 4:13 下午
 * @description
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
