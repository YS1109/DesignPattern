package com.ysoztf.composite;

/**
 * 组合模式其实和数据结构中的树形结构类似
 * 可以将一些通用的功能抽出来，然后进行组合以实现不同场景的不同需求
 */
public class CompositeClient {
    public static void main(String[] args) {
        //初始化结构
        CommonEntity root = new BranchEntity("root");
        root.add(new BranchEntity("branchEntity1"));
        root.add(new BranchEntity("branchEntity2"));
        root.add(new LeafEntity("leafEntity1"));
        root.add(new LeafEntity("leafEntity2"));
        int count = 3;
        for (CommonEntity commonEntity : root.getChildren()) {
            if (commonEntity.getChildren() != null) {
                commonEntity.add(new BranchEntity("branchEntity" + count));
                commonEntity.add(new BranchEntity("branchEntity" + (count + 1)));
                commonEntity.add(new LeafEntity("leafEntity" + count));
                commonEntity.add(new LeafEntity("leafEntity" + (count + 1)));
                count += 2;
            }
        }

        //数据展示
        root.showChildren(3);
        root.doSomething();
    }
}
