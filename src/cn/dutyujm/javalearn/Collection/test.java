package cn.dutyujm.javalearn.Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

    public static  void main(String[] args) {
        /**List数据结构*/
        /**ArrayList的数据是数组一样的也就是说ArrayList中的数据查找速度快但是向中间插入删除会很慢，因为整个list会移动*/
        ArrayList<Integer> integerList = new ArrayList<>();
        /**Vector和ArrayList很相似,基础都是数组,但Vector使用了synchronized方法是线程同步的,线程安全,所以一般来说Arraylist比较快,
         * 但是因为Vector每次扩容都是目前数组长度的100%,而ArrayList扩容是目前数组长度的50%,所以数据量大的时候Vector更有优势*/
        Vector<Integer> vector = new Vector<>();
        /**LinkedList是链表，也就说其插入删除一个数据会很快，不涉及整体的移动,但是查找速度会很慢，因为要涉及指针的移动*/
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        /**栈是先进后出的接口，java提供的stack是属于list类的*/
        Stack<Integer> stack = new Stack<>();
        /**读写分离,写时复制出一个新的数组,完成插入、修改或者移除操作后将新数组赋值给array,增删改都会new一个新的数组，所以写不会对读造成影响，支持读多写少的并发情况,*/
        CopyOnWriteArrayList<Integer> integerCopyOnWriteArrayList = new CopyOnWriteArrayList<>();

        integerList.add(1);
        integerList.add(3);
        integerList.add(3421);
        integerList.add(21);
        integerList.add(342);
        integerList.add(5324);
        integerList.add(12);
        integerList.sort((o1, o2) -> o1-o2);
        System.out.println(integerList);

        vector.add(1);
        vector.add(3);
        vector.add(3421);
        vector.add(21);
        vector.add(342);
        vector.add(5324);
        vector.add(12);
        System.out.println(vector);

        integerLinkedList.add(1);
        integerLinkedList.add(3);
        integerLinkedList.add(3421);
        integerLinkedList.add(21);
        integerLinkedList.add(342);
        integerLinkedList.add(5324);
        integerLinkedList.add(12);
        System.out.println(integerLinkedList);

        stack.add(1);
        stack.add(3);
        stack.add(3421);
        stack.add(21);
        stack.add(342);
        stack.add(5324);
        stack.add(12);
        stack.peek();//peek可以获取栈顶元素的值且不出栈
        stack.pop();//pop获取栈顶元素的值且出栈
        stack.push(123);//push向栈里加东西,返回值是参数类型
        stack.add(312);//add是继承自Vector的方法,返回值是参数类类型
        System.out.println(stack);

        integerCopyOnWriteArrayList.add(1);
        integerCopyOnWriteArrayList.add(3);
        integerCopyOnWriteArrayList.add(3421);
        integerCopyOnWriteArrayList.add(21);
        integerCopyOnWriteArrayList.add(342);
        integerCopyOnWriteArrayList.add(5324);
        integerCopyOnWriteArrayList.add(12);
        System.out.println(integerCopyOnWriteArrayList);


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



        /**Map类型(Map是双列的,Collection是单列的(set和List本质上都是Collection的子类),Map的键是唯一的，使用自定义类的时候也需要重写equals方法)
         *
         * HashMap:使用位桶和红黑树，它是线程不安全的Map，方法上没有synchronize关键字修饰
         * hashTable线程安全，它实现线程安全的方法是在各个方法上添加了synchronize关键字。而应该使用ConcurrentHashMap。
         * ConcurrentHashMap是线程安全的
         * TreeMap也是一个很常用的map实现类，因为他具有一个很大的特点就是会对Key进行排序，使用了TreeMap存储键值对，再使用iterator进行输出时，需要重写compartor接口
         * LinkedHashMap 有序,先进先出
         *
         **/
        //HashMap有两个重要的成员变量，一个是桶大小，一个是负载因子，桶大小只会是2的次方默认是16,而负载因子默认是0.75,意思是当map里的元素大于16*0.75后,map会扩容
        //map每次扩容的大小会是原来的2倍

        HashMap<Person,String> personStringHashMap = new HashMap<>();
        personStringHashMap.put(new Person("saas",12),"tast");//存储键值对
        personStringHashMap.put(new Person("fds",321),"sdaf");
        personStringHashMap.put(new Person("哇哇哇",324),"wnrt");
        personStringHashMap.put(new Person("发送到",324),"wnrt");
        personStringHashMap.put(new Person("文身断发",324),"wnrt");
        personStringHashMap.put(new Person("你规范化",324),"wnrt");
        personStringHashMap.put(new Person("十多个",324),"wnrt");

        personStringHashMap.get(new Person("十多个",324));//通过键拿值
        personStringHashMap.isEmpty();//判空
        personStringHashMap.size();//得到大小
        personStringHashMap.containsKey(new Person("十多个",324));//判断是否包含
        personStringHashMap.clear();//清空

        /**遍历输出键*/
        for (Person person: personStringHashMap.keySet()) {
            System.out.println(person);
        }
        /**遍历输出值*/
        for (String str:personStringHashMap.values()) {
            System.out.println(str);
        }

        /**遍历map的几种方法*/
        Iterator<Map.Entry<Person, String>> entryIterator=personStringHashMap.entrySet().iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<Person,String> entry=entryIterator.next();
            Person key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }

        System.out.println(personStringHashMap);

        HashMap<Person,String> personStringHashMap2 = new HashMap<>();
        personStringHashMap.put(new Person("更符合＋",324),"bsdgfbhsgdfb");
        personStringHashMap.put(new Person("国道3",324),"fdsgfdsg");
        personStringHashMap.put(new Person("根号他",324),"wnrdfgdfst");

        /**putAll方法可以在一个map中加入另一个map中的所有键值对*/
        personStringHashMap2.putAll(personStringHashMap);
        /**clear方法可以清空map*/
        personStringHashMap2.clear();
        /**看map中是否有键为某个元素的键值对*/
        personStringHashMap2.containsKey(new Person("十多个",324));
        /**将map中的键值对以key=value的形式加入到set中*/
        Set set = personStringHashMap.entrySet();
        /**返回所有的值*/
        Collection col = personStringHashMap.values();
        /**返回所有的键*/
        set = personStringHashMap.keySet();

        //下面这个是一个线程安全的map
        Map<Person,String> personStringHashMap3 = new ConcurrentHashMap<>();
        /**putIfAbsent方法,如果key对应的value不存在就put,存在就返回已存在的值*/
        personStringHashMap3.putIfAbsent(new Person("根号他",324),"wnrdfgdfst");
        /**在remove有两个参数的时候，remove会判断key是否对应着value，如果是则移除并返回true否则为false*/
        personStringHashMap3.remove(new Person("根号他",324),"wnrdfgdfst");
        /**replace(K key, V oldValue, V newValue)如果当前key对应的值是oldValue则替换为newValue并返回true*/
        personStringHashMap3.replace(new Person("根号他",324),"wnrdfgdfst","sdsss");





    }
}
