package Tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class NestedInteger {
    private Integer val;
    private List<NestedInteger> list;

    public NestedInteger(Integer val) {
        this.val = val;
        this.list = null;
    }
    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
        this.val = null;
    }

    // 如果其中存的是一个整数，则返回 true，否则返回 false
    public boolean isInteger() {
        return val != null;
    }

    // 如果其中存的是一个整数，则返回这个整数，否则返回 null
    public Integer getInteger() {
        return this.val;
    }

    // 如果其中存的是一个列表，则返回这个列表，否则返回 null
    public List<NestedInteger> getList() {
        return this.list;
    }
}

public class T0341_FlattenNestedListIterator implements Iterator<Integer> {

    private Iterator<Integer> it;

    public T0341_FlattenNestedListIterator(List<NestedInteger> nestedList) {
        List<Integer> result = new LinkedList<>();
        for(NestedInteger node : nestedList){
            traverse(node,result);
        }
        this.it = result.iterator();
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    private void traverse(NestedInteger root,List<Integer> result){
        if(root.isInteger()){
            result.add(root.getInteger());
            return;
        }
        else{
            for(NestedInteger node : root.getList()){
                traverse(node,result);
            }

        }
    }
}
