/**
 */
package projekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.BodyElement#getText <em>Text</em>}</li>
 *   <li>{@link projekt.BodyElement#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link projekt.BodyElement#getHeadings <em>Headings</em>}</li>
 *   <li>{@link projekt.BodyElement#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link projekt.BodyElement#getDivs <em>Divs</em>}</li>
 *   <li>{@link projekt.BodyElement#getSpans <em>Spans</em>}</li>
 *   <li>{@link projekt.BodyElement#getUnorderedLists <em>Unordered Lists</em>}</li>
 *   <li>{@link projekt.BodyElement#getOrderedLists <em>Ordered Lists</em>}</li>
 *   <li>{@link projekt.BodyElement#getListItems <em>List Items</em>}</li>
 *   <li>{@link projekt.BodyElement#getFooters <em>Footers</em>}</li>
 *   <li>{@link projekt.BodyElement#getHeaders <em>Headers</em>}</li>
 *   <li>{@link projekt.BodyElement#getHyperLinks <em>Hyper Links</em>}</li>
 *   <li>{@link projekt.BodyElement#getImages <em>Images</em>}</li>
 *   <li>{@link projekt.BodyElement#getBoldTexts <em>Bold Texts</em>}</li>
 *   <li>{@link projekt.BodyElement#getItalicTexts <em>Italic Texts</em>}</li>
 *   <li>{@link projekt.BodyElement#getUnderlineTexts <em>Underline Texts</em>}</li>
 *   <li>{@link projekt.BodyElement#getLineBreaks <em>Line Breaks</em>}</li>
 *   <li>{@link projekt.BodyElement#getCodes <em>Codes</em>}</li>
 *   <li>{@link projekt.BodyElement#getPlainTexts <em>Plain Texts</em>}</li>
 *   <li>{@link projekt.BodyElement#getForms <em>Forms</em>}</li>
 *   <li>{@link projekt.BodyElement#getFormLabels <em>Form Labels</em>}</li>
 *   <li>{@link projekt.BodyElement#getFormFields <em>Form Fields</em>}</li>
 *   <li>{@link projekt.BodyElement#getFormButtons <em>Form Buttons</em>}</li>
 *   <li>{@link projekt.BodyElement#getFormCheckBoxRadios <em>Form Check Box Radios</em>}</li>
 *   <li>{@link projekt.BodyElement#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getBodyElement()
 * @model
 * @generated
 */
public interface BodyElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see projekt.ProjektPackage#getBodyElement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link projekt.BodyElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Body Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.BodyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Elements</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_BodyElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyElement> getBodyElements();

	/**
	 * Returns the value of the '<em><b>Headings</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Heading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headings</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Headings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Heading> getHeadings();

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Divs</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divs</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Divs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Div> getDivs();

	/**
	 * Returns the value of the '<em><b>Spans</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spans</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Spans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Span> getSpans();

	/**
	 * Returns the value of the '<em><b>Unordered Lists</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.UnorderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unordered Lists</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_UnorderedLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnorderedList> getUnorderedLists();

	/**
	 * Returns the value of the '<em><b>Ordered Lists</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.OrderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Lists</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_OrderedLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderedList> getOrderedLists();

	/**
	 * Returns the value of the '<em><b>List Items</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Items</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_ListItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getListItems();

	/**
	 * Returns the value of the '<em><b>Footers</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Footer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footers</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Footers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Footer> getFooters();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

	/**
	 * Returns the value of the '<em><b>Hyper Links</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.HyperLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyper Links</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_HyperLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<HyperLink> getHyperLinks();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Bold Texts</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.BoldText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold Texts</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_BoldTexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoldText> getBoldTexts();

	/**
	 * Returns the value of the '<em><b>Italic Texts</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.ItalicText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic Texts</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_ItalicTexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItalicText> getItalicTexts();

	/**
	 * Returns the value of the '<em><b>Underline Texts</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.UnderlineText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline Texts</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_UnderlineTexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnderlineText> getUnderlineTexts();

	/**
	 * Returns the value of the '<em><b>Line Breaks</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.LineBreak}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Breaks</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_LineBreaks()
	 * @model containment="true"
	 * @generated
	 */
	EList<LineBreak> getLineBreaks();

	/**
	 * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codes</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Codes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getCodes();

	/**
	 * Returns the value of the '<em><b>Plain Texts</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.PlainText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain Texts</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_PlainTexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainText> getPlainTexts();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Form Labels</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.FormLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Labels</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_FormLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormLabel> getFormLabels();

	/**
	 * Returns the value of the '<em><b>Form Fields</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.FormField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Fields</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_FormFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormField> getFormFields();

	/**
	 * Returns the value of the '<em><b>Form Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.FormButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Buttons</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_FormButtons()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormButton> getFormButtons();

	/**
	 * Returns the value of the '<em><b>Form Check Box Radios</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.FormCheckBoxRadio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Check Box Radios</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_FormCheckBoxRadios()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormCheckBoxRadio> getFormCheckBoxRadios();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see projekt.ProjektPackage#getBodyElement_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // BodyElement
