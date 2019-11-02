function replaceSpace(str)
{
    if ( str == null ) {
        return "";
    }
    var len = str.length;
    var begin_index = str.indexOf(" ");  //空格的下标
    while( begin_index != -1 ) {   //存在空格
        str.replace(begin_index, begin_index+1, "%20");   //替换
        begin_index = str.indexOf(" ", begin_index);   //从上一个空格的位置开始查找下一个空格
    }
    return str;
}

console.log(replaceSpace("We Are Happy"))
