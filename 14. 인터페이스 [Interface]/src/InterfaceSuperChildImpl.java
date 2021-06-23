
public class InterfaceSuperChildImpl implements InterfaceSuperChild {

	@Override
	public void method_super1() {
		System.out.println("InterfaceSuper.method_super1()를 구현: Implement");
	}

	@Override
	public void method_super2() {
		System.out.println("InterfaceSuper.method_super2()를 구현: Implement");
	}

	@Override
	public void method_child1() {
		System.out.println("InterfaceSuperChild.method_super1()를 구현: Implement");
	}

	@Override
	public void method_child2() {
		System.out.println("InterfaceSuperChild.method_super2()를 구현: Implement");
	}

}
