package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);

        //System.out.println(tree.branches == clone.branches);

    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Tree clone() throws CloneNotSupportedException {
            /*String[] branchClone = new String[this.branches.length];
            for (int i = 0; i<this.branches.length; i++) {
                branchClone[i] = this.branches[i];
            }*/
            Tree treeClone = new Tree(this.getName(), branches.clone());
            return treeClone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tree)) return false;
            Tree tree = (Tree) o;
            return Arrays.equals(branches, tree.branches);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(branches);
        }
    }
}
