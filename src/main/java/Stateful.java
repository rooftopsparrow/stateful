/**
 * A mutable object that maintains state. Three components of state include textual, numerical, and logical data.
 * @version CS4250 Fall 2017 v2.4.2-impl.1
 * @author Dr. Jody Paul
 * @author Jonathan Nicholson
 */
public class Stateful {

  private Number number;
  private Boolean truth;
  private String text;

  /**
   * Constructs a stateful object using arbitrary values
   */
  public Stateful() {
    this.number = 0;
    this.truth = false;
    this.text = "";
  }

  /**
   * Constructs a stateful object using specified values.
   *
   * @param text  the textual data
   * @param number  the numerical data
   * @param truth  the logical number
   */
  public Stateful(String text, Number number, Boolean truth) {
    this.text = text;
    this.number = number;
    this.truth = truth;
  }

  /**
   * Modifies the state by inverting the logical value.
   *
   * If the state value was true, it is changed to false. If the state value was false, it is changed to true.
   */
  public void flip () {
    this.truth = !this.truth;
  }

  /**
   * Accesses the logic component of state.
   * @return the truth status
   */
  public Boolean truth() {
    return this.truth;
  }

  /**
   * Accesses the numeric component of state.
   * @return the numerical status
   */
  public Number number() {
    return this.number;
  }

  /**
   * Accesses the text component of state.
   * @return the texual status
   */
  public String text() {
    return this.text;
  }

  /**
   * Renders object in the format: Stateful[truth, number, "text"]
   */
  public String toString() {
    return "Stateful[" + this.truth + ", " + this.number + ", \"" + this.text + "\"]";
  }

}
