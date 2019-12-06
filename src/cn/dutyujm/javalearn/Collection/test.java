package cn.dutyujm.javalearn.Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

    public static  void main(String[] args) {
        /**ArrayList的数据是数组一样的也就是说ArrayList中的数据查找速度快但是向中间插入删除会很慢，因为整个list会移动*/
        List<Integer> integerList = new ArrayList<>();
        /**LinkedList是链表，也就说其插入删除一个数据会很快，不涉及整体的移动,但是查找速度会很慢，因为要涉及指针的移动*/
        List<Integer> integerList1 = new LinkedList<>();
        /**栈是先进后出的接口，java提供的stack是属于list类的*/
        Stack<Integer> integerList2 = new Stack<>();
        /**读写分离,写时复制出一个新的数组,完成插入、修改或者移除操作后将新数组赋值给array,增删改都会new一个新的数组，所以写不会对读造成影响，支持读多写少的并发情况,*/
        List<Integer> integerList3 = new CopyOnWriteArrayList<>();

        integerList.add(1);
        integerList.add(3);
        integerList.add(3421);
        integerList.add(21);
        integerList.add(342);
        integerList.add(5324);
        integerList.add(12);
        integerList.sort((o1, o2) -> o1-o2);
        System.out.println(integerList);

        integerList1.add(1);
        integerList1.add(3);
        integerList1.add(3421);
        integerList1.add(21);
        integerList1.add(342);
        integerList1.add(5324);
        integerList1.add(12);
        System.out.println(integerList1);

        integerList2.add(1);
        integerList2.add(3);
        integerList2.add(3421);
        integerList2.add(21);
        integerList2.add(342);
        integerList2.add(5324);
        integerList2.add(12);
        integerList2.peek();//peek可以获取栈顶元素的值且不出栈
        integerList2.pop();//pop获取栈顶元素的值且出栈
        integerList2.push(123);//push向栈里加东西,返回值是参数类型
        integerList2.add(312);//add是继承自Vector的方法,返回值是参数类类型
        System.out.println(integerList2);







        /**
         * SET数据结构,有HashSet,TreeSet,LinkedHashSet三种
         * Set类型的特点是不存在重复的元素
         * 当需要一个快速访问的Set,使用HashSet
         * 当需要一个有序的Set,使用TreeSet
         * 当需要记录插入的顺序时,使用LinkedHashSet
         * 因为Set是不可重复的数据结构,所以每次插入值的时候,会将待插入元素做一个对比,看有没有重复的数据
         * 这样子就会涉及到如何对比两个元素是否一样,当Set内储存的数据类型是Integer,String,Double等类型时,可以很轻易的比较是否一致
         * 但是当使用我们自己定义的类型的时候,对比两个元素是否一样就需要重写HashCode和equals方法
         * 此外因为TreeSet是有序的,所以自己定义的类必须有一个比较两个元素大小的函数,也就是需要重写compareTo方法
         * */

        //HashSet输出的循序是奇葩的
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("3");
        stringSet.add("3421");
        stringSet.add("21");
        stringSet.add("342");
        stringSet.add("5324");
        stringSet.add("12");

        /**用迭代器遍历Set*/
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("saas",12));
        personSet.add(new Person("saas",12));
        personSet.add(new Person("fds",321));
        personSet.add(new Person("das",32));
        personSet.add(new Person("gwe",113));
        personSet.add(new Person("gf",324));

        /**增强for循环遍历Set*/
        for (Person item:personSet) {
            System.out.println(item);
        }

        //TreeSet输出的顺序是经过排序的
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("saas",12));
        personTreeSet.add(new Person("fds",321));
        personTreeSet.add(new Person("das",32));
        personTreeSet.add(new Person("gwe",113));
        personTreeSet.add(new Person("gf",324));
        personTreeSet.add(new Person("dsadd",324));
        personTreeSet.add(new Person("fdsfda",324));
        personTreeSet.add(new Person("fasdfzxcv",3124));
        personTreeSet.add(new Person("dsvxczvzadd",324));
        System.out.println(personTreeSet);

        //LinkedHashSet输出的顺序和插入的顺序是不一样的
        Set<Person>  personLinkedHashSet = new LinkedHashSet<>();
        personLinkedHashSet.add(new Person("非的方式·1",12));
        personLinkedHashSet.add(new Person("发送到",321));
        personLinkedHashSet.add(new Person("手动阀",32));
        personLinkedHashSet.add(new Person("改水电费",113));
        personLinkedHashSet.add(new Person("广东佛山2",324));
        personLinkedHashSet.add(new Person("广东佛山",324));
        personLinkedHashSet.add(new Person("报错",324));
        personLinkedHashSet.add(new Person("别出V型",3124));
        personLinkedHashSet.add(new Person("开奖号",324));

        System.out.println(personLinkedHashSet);



        /**Map类型
         *
         *
         *
         *
         * */
        HashMap<Person,String> personStringHashMap = new HashMap<>();
        personStringHashMap.put(new Person("saas",12),"tast");
        personStringHashMap.put(new Person("fds",321),"sdaf");
        personStringHashMap.put(new Person("das",32),"zxcv");
        personStringHashMap.put(new Person("gwe",113),"hjg");
        personStringHashMap.put(new Person("gf",324),"kui");
        personStringHashMap.put(new Person("dsadd",324),"grht");
        personStringHashMap.put(new Person("fdsfda",324),"gfnd");
        personStringHashMap.put(new Person("fasdfzxcv",3124),"dgbs");
        personStringHashMap.put(new Person("哇哇哇",324),"wnrt");
        personStringHashMap.put(new Person("发送到",324),"wnrt");
        personStringHashMap.put(new Person("文身断发",324),"wnrt");
        personStringHashMap.put(new Person("你规范化",324),"wnrt");
        personStringHashMap.put(new Person("十多个",324),"wnrt");
        System.out.println(personStringHashMap);


        HashMap<Person,String> personStringHashMap2 = new HashMap<>();
        personStringHashMap2.put(new Person("saas",12),"tast");
        personStringHashMap2.put(new Person("gwe",113),"hjg");
        personStringHashMap2.put(new Person("fds",321),"sdaf");
        personStringHashMap2.put(new Person("das",32),"zxcv");
        personStringHashMap2.put(new Person("gf",324),"kui");
        personStringHashMap2.put(new Person("fasdfzxcv",3124),"dgbs");
        personStringHashMap2.put(new Person("dsadd",324),"grht");
        personStringHashMap2.put(new Person("fdsfda",324),"gfnd");
        personStringHashMap2.put(new Person("哇哇哇",324),"wnrt");
        personStringHashMap2.put(new Person("你规范化",324),"wnrt");
        personStringHashMap2.put(new Person("十多个",324),"wnrt");
        personStringHashMap2.put(new Person("发送到",324),"wnrt");
        System.out.println(personStringHashMap2);
        System.out.println(personStringHashMap.equals(personStringHashMap2));

    }
}
