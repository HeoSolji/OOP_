import java.util.*;
public class ClassObj {
	public String ClassName;
	public List <String> stringFields;
	public List <String> stringMethods;
	public List <Field> listFields;
	public List <Method> listMethods;
	public String ClassExtend;
	public String name;
	public boolean isExtend;
	public ClassObj(String _ClassName, List<String> _fields,List<String> _methods,String _ClassExtend,boolean _isExtend,String _name) {
		ClassName= _ClassName;
		stringFields =_fields;
		stringMethods= _methods;
		ClassExtend=_ClassExtend;
		isExtend=_isExtend;
		name= _name;
	}
//	public String to_String() {
//		return ClassName;
//	}
//	public void setStringforClassObj() {
//		for(Field f: listFields) {
//			stringFields.add(f.toString());
//		}
//		for(Method m: listMethods) {
//			stringMethods.add(m.toString());
//		}
//	}
}
