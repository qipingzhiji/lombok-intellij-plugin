public class ReplaceGetterFromMethod2 {
  private int field;

  public int get<caret>Field() {
    return field;
  }

  public int setField(int field) {
    this.field = field;
  }
}
