package com.sham.objectclassmethods;

import java.util.HashSet;
import java.util.Objects;

class Students {
    int id;

    Students(int id) {
        this.id = id;
    }

    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id;
	}    
}

public class  EqualsHashcodeContract{
    public static void main(String[] args) {
        Students s1 = new Students(1);
        Students s2 = new Students(1);

        System.out.println(s1.equals(s2)); // true

        HashSet<Students> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size()); // 2 ❌ (should be 1)
    }
}