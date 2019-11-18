package com.v28_31;

import java.util.function.Function;

public class UseFoo {
	// 1
	public String add(String name, Foo foo) {
		return foo.getName(name);
	}

	// 2
	public String add(String name, Function<String, String> foo) {
		return foo.apply(name);
	}
}
