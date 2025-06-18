/**
 */
package projekt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projekt.BodyElement;
import projekt.BoldText;
import projekt.Code;
import projekt.Div;
import projekt.Footer;
import projekt.Form;
import projekt.FormButton;
import projekt.FormCheckBoxRadio;
import projekt.FormField;
import projekt.FormLabel;
import projekt.Header;
import projekt.Heading;
import projekt.HyperLink;
import projekt.Image;
import projekt.ItalicText;
import projekt.LineBreak;
import projekt.ListItem;
import projekt.OrderedList;
import projekt.Paragraph;
import projekt.PlainText;
import projekt.ProjektPackage;
import projekt.Span;
import projekt.Table;
import projekt.UnderlineText;
import projekt.UnorderedList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projekt.impl.BodyElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getHeadings <em>Headings</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getDivs <em>Divs</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getSpans <em>Spans</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getUnorderedLists <em>Unordered Lists</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getOrderedLists <em>Ordered Lists</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getListItems <em>List Items</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getFooters <em>Footers</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getHyperLinks <em>Hyper Links</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getImages <em>Images</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getBoldTexts <em>Bold Texts</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getItalicTexts <em>Italic Texts</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getUnderlineTexts <em>Underline Texts</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getLineBreaks <em>Line Breaks</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getPlainTexts <em>Plain Texts</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getFormLabels <em>Form Labels</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getFormFields <em>Form Fields</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getFormButtons <em>Form Buttons</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getFormCheckBoxRadios <em>Form Check Box Radios</em>}</li>
 *   <li>{@link projekt.impl.BodyElementImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyElementImpl extends MinimalEObjectImpl.Container implements BodyElement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodyElements() <em>Body Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyElement> bodyElements;

	/**
	 * The cached value of the '{@link #getHeadings() <em>Headings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Heading> headings;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * The cached value of the '{@link #getDivs() <em>Divs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivs()
	 * @generated
	 * @ordered
	 */
	protected EList<Div> divs;

	/**
	 * The cached value of the '{@link #getSpans() <em>Spans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpans()
	 * @generated
	 * @ordered
	 */
	protected EList<Span> spans;

	/**
	 * The cached value of the '{@link #getUnorderedLists() <em>Unordered Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnorderedLists()
	 * @generated
	 * @ordered
	 */
	protected EList<UnorderedList> unorderedLists;

	/**
	 * The cached value of the '{@link #getOrderedLists() <em>Ordered Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedLists()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderedList> orderedLists;

	/**
	 * The cached value of the '{@link #getListItems() <em>List Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> listItems;

	/**
	 * The cached value of the '{@link #getFooters() <em>Footers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooters()
	 * @generated
	 * @ordered
	 */
	protected EList<Footer> footers;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * The cached value of the '{@link #getHyperLinks() <em>Hyper Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<HyperLink> hyperLinks;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getBoldTexts() <em>Bold Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoldTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BoldText> boldTexts;

	/**
	 * The cached value of the '{@link #getItalicTexts() <em>Italic Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalicTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ItalicText> italicTexts;

	/**
	 * The cached value of the '{@link #getUnderlineTexts() <em>Underline Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlineTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<UnderlineText> underlineTexts;

	/**
	 * The cached value of the '{@link #getLineBreaks() <em>Line Breaks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBreaks()
	 * @generated
	 * @ordered
	 */
	protected EList<LineBreak> lineBreaks;

	/**
	 * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> codes;

	/**
	 * The cached value of the '{@link #getPlainTexts() <em>Plain Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainText> plainTexts;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getFormLabels() <em>Form Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<FormLabel> formLabels;

	/**
	 * The cached value of the '{@link #getFormFields() <em>Form Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FormField> formFields;

	/**
	 * The cached value of the '{@link #getFormButtons() <em>Form Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<FormButton> formButtons;

	/**
	 * The cached value of the '{@link #getFormCheckBoxRadios() <em>Form Check Box Radios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormCheckBoxRadios()
	 * @generated
	 * @ordered
	 */
	protected EList<FormCheckBoxRadio> formCheckBoxRadios;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektPackage.Literals.BODY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektPackage.BODY_ELEMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyElement> getBodyElements() {
		if (bodyElements == null) {
			bodyElements = new EObjectContainmentEList<BodyElement>(BodyElement.class, this,
					ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS);
		}
		return bodyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Heading> getHeadings() {
		if (headings == null) {
			headings = new EObjectContainmentEList<Heading>(Heading.class, this, ProjektPackage.BODY_ELEMENT__HEADINGS);
		}
		return headings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this,
					ProjektPackage.BODY_ELEMENT__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Div> getDivs() {
		if (divs == null) {
			divs = new EObjectContainmentEList<Div>(Div.class, this, ProjektPackage.BODY_ELEMENT__DIVS);
		}
		return divs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Span> getSpans() {
		if (spans == null) {
			spans = new EObjectContainmentEList<Span>(Span.class, this, ProjektPackage.BODY_ELEMENT__SPANS);
		}
		return spans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnorderedList> getUnorderedLists() {
		if (unorderedLists == null) {
			unorderedLists = new EObjectContainmentEList<UnorderedList>(UnorderedList.class, this,
					ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS);
		}
		return unorderedLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderedList> getOrderedLists() {
		if (orderedLists == null) {
			orderedLists = new EObjectContainmentEList<OrderedList>(OrderedList.class, this,
					ProjektPackage.BODY_ELEMENT__ORDERED_LISTS);
		}
		return orderedLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListItem> getListItems() {
		if (listItems == null) {
			listItems = new EObjectContainmentEList<ListItem>(ListItem.class, this,
					ProjektPackage.BODY_ELEMENT__LIST_ITEMS);
		}
		return listItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Footer> getFooters() {
		if (footers == null) {
			footers = new EObjectContainmentEList<Footer>(Footer.class, this, ProjektPackage.BODY_ELEMENT__FOOTERS);
		}
		return footers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<Header>(Header.class, this, ProjektPackage.BODY_ELEMENT__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HyperLink> getHyperLinks() {
		if (hyperLinks == null) {
			hyperLinks = new EObjectContainmentEList<HyperLink>(HyperLink.class, this,
					ProjektPackage.BODY_ELEMENT__HYPER_LINKS);
		}
		return hyperLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, ProjektPackage.BODY_ELEMENT__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoldText> getBoldTexts() {
		if (boldTexts == null) {
			boldTexts = new EObjectContainmentEList<BoldText>(BoldText.class, this,
					ProjektPackage.BODY_ELEMENT__BOLD_TEXTS);
		}
		return boldTexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItalicText> getItalicTexts() {
		if (italicTexts == null) {
			italicTexts = new EObjectContainmentEList<ItalicText>(ItalicText.class, this,
					ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS);
		}
		return italicTexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnderlineText> getUnderlineTexts() {
		if (underlineTexts == null) {
			underlineTexts = new EObjectContainmentEList<UnderlineText>(UnderlineText.class, this,
					ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS);
		}
		return underlineTexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LineBreak> getLineBreaks() {
		if (lineBreaks == null) {
			lineBreaks = new EObjectContainmentEList<LineBreak>(LineBreak.class, this,
					ProjektPackage.BODY_ELEMENT__LINE_BREAKS);
		}
		return lineBreaks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Code>(Code.class, this, ProjektPackage.BODY_ELEMENT__CODES);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlainText> getPlainTexts() {
		if (plainTexts == null) {
			plainTexts = new EObjectContainmentEList<PlainText>(PlainText.class, this,
					ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS);
		}
		return plainTexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, ProjektPackage.BODY_ELEMENT__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormLabel> getFormLabels() {
		if (formLabels == null) {
			formLabels = new EObjectContainmentEList<FormLabel>(FormLabel.class, this,
					ProjektPackage.BODY_ELEMENT__FORM_LABELS);
		}
		return formLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormField> getFormFields() {
		if (formFields == null) {
			formFields = new EObjectContainmentEList<FormField>(FormField.class, this,
					ProjektPackage.BODY_ELEMENT__FORM_FIELDS);
		}
		return formFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormButton> getFormButtons() {
		if (formButtons == null) {
			formButtons = new EObjectContainmentEList<FormButton>(FormButton.class, this,
					ProjektPackage.BODY_ELEMENT__FORM_BUTTONS);
		}
		return formButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormCheckBoxRadio> getFormCheckBoxRadios() {
		if (formCheckBoxRadios == null) {
			formCheckBoxRadios = new EObjectContainmentEList<FormCheckBoxRadio>(FormCheckBoxRadio.class, this,
					ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS);
		}
		return formCheckBoxRadios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, ProjektPackage.BODY_ELEMENT__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
			return ((InternalEList<?>) getBodyElements()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
			return ((InternalEList<?>) getHeadings()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
			return ((InternalEList<?>) getParagraphs()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__DIVS:
			return ((InternalEList<?>) getDivs()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__SPANS:
			return ((InternalEList<?>) getSpans()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
			return ((InternalEList<?>) getUnorderedLists()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
			return ((InternalEList<?>) getOrderedLists()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
			return ((InternalEList<?>) getListItems()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
			return ((InternalEList<?>) getFooters()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__HEADERS:
			return ((InternalEList<?>) getHeaders()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
			return ((InternalEList<?>) getHyperLinks()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
			return ((InternalEList<?>) getBoldTexts()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
			return ((InternalEList<?>) getItalicTexts()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
			return ((InternalEList<?>) getUnderlineTexts()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
			return ((InternalEList<?>) getLineBreaks()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__CODES:
			return ((InternalEList<?>) getCodes()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
			return ((InternalEList<?>) getPlainTexts()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
			return ((InternalEList<?>) getFormLabels()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
			return ((InternalEList<?>) getFormFields()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
			return ((InternalEList<?>) getFormButtons()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
			return ((InternalEList<?>) getFormCheckBoxRadios()).basicRemove(otherEnd, msgs);
		case ProjektPackage.BODY_ELEMENT__TABLES:
			return ((InternalEList<?>) getTables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjektPackage.BODY_ELEMENT__TEXT:
			return getText();
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
			return getBodyElements();
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
			return getHeadings();
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
			return getParagraphs();
		case ProjektPackage.BODY_ELEMENT__DIVS:
			return getDivs();
		case ProjektPackage.BODY_ELEMENT__SPANS:
			return getSpans();
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
			return getUnorderedLists();
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
			return getOrderedLists();
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
			return getListItems();
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
			return getFooters();
		case ProjektPackage.BODY_ELEMENT__HEADERS:
			return getHeaders();
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
			return getHyperLinks();
		case ProjektPackage.BODY_ELEMENT__IMAGES:
			return getImages();
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
			return getBoldTexts();
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
			return getItalicTexts();
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
			return getUnderlineTexts();
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
			return getLineBreaks();
		case ProjektPackage.BODY_ELEMENT__CODES:
			return getCodes();
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
			return getPlainTexts();
		case ProjektPackage.BODY_ELEMENT__FORMS:
			return getForms();
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
			return getFormLabels();
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
			return getFormFields();
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
			return getFormButtons();
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
			return getFormCheckBoxRadios();
		case ProjektPackage.BODY_ELEMENT__TABLES:
			return getTables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjektPackage.BODY_ELEMENT__TEXT:
			setText((String) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
			getBodyElements().clear();
			getBodyElements().addAll((Collection<? extends BodyElement>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
			getHeadings().clear();
			getHeadings().addAll((Collection<? extends Heading>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
			getParagraphs().clear();
			getParagraphs().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__DIVS:
			getDivs().clear();
			getDivs().addAll((Collection<? extends Div>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__SPANS:
			getSpans().clear();
			getSpans().addAll((Collection<? extends Span>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
			getUnorderedLists().clear();
			getUnorderedLists().addAll((Collection<? extends UnorderedList>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
			getOrderedLists().clear();
			getOrderedLists().addAll((Collection<? extends OrderedList>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
			getListItems().clear();
			getListItems().addAll((Collection<? extends ListItem>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
			getFooters().clear();
			getFooters().addAll((Collection<? extends Footer>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__HEADERS:
			getHeaders().clear();
			getHeaders().addAll((Collection<? extends Header>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
			getHyperLinks().clear();
			getHyperLinks().addAll((Collection<? extends HyperLink>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
			getBoldTexts().clear();
			getBoldTexts().addAll((Collection<? extends BoldText>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
			getItalicTexts().clear();
			getItalicTexts().addAll((Collection<? extends ItalicText>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
			getUnderlineTexts().clear();
			getUnderlineTexts().addAll((Collection<? extends UnderlineText>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
			getLineBreaks().clear();
			getLineBreaks().addAll((Collection<? extends LineBreak>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__CODES:
			getCodes().clear();
			getCodes().addAll((Collection<? extends Code>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
			getPlainTexts().clear();
			getPlainTexts().addAll((Collection<? extends PlainText>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
			getFormLabels().clear();
			getFormLabels().addAll((Collection<? extends FormLabel>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
			getFormFields().clear();
			getFormFields().addAll((Collection<? extends FormField>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
			getFormButtons().clear();
			getFormButtons().addAll((Collection<? extends FormButton>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
			getFormCheckBoxRadios().clear();
			getFormCheckBoxRadios().addAll((Collection<? extends FormCheckBoxRadio>) newValue);
			return;
		case ProjektPackage.BODY_ELEMENT__TABLES:
			getTables().clear();
			getTables().addAll((Collection<? extends Table>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjektPackage.BODY_ELEMENT__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
			getBodyElements().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
			getHeadings().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
			getParagraphs().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__DIVS:
			getDivs().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__SPANS:
			getSpans().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
			getUnorderedLists().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
			getOrderedLists().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
			getListItems().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
			getFooters().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__HEADERS:
			getHeaders().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
			getHyperLinks().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__IMAGES:
			getImages().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
			getBoldTexts().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
			getItalicTexts().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
			getUnderlineTexts().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
			getLineBreaks().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__CODES:
			getCodes().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
			getPlainTexts().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FORMS:
			getForms().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
			getFormLabels().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
			getFormFields().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
			getFormButtons().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
			getFormCheckBoxRadios().clear();
			return;
		case ProjektPackage.BODY_ELEMENT__TABLES:
			getTables().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjektPackage.BODY_ELEMENT__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
			return bodyElements != null && !bodyElements.isEmpty();
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
			return headings != null && !headings.isEmpty();
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
			return paragraphs != null && !paragraphs.isEmpty();
		case ProjektPackage.BODY_ELEMENT__DIVS:
			return divs != null && !divs.isEmpty();
		case ProjektPackage.BODY_ELEMENT__SPANS:
			return spans != null && !spans.isEmpty();
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
			return unorderedLists != null && !unorderedLists.isEmpty();
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
			return orderedLists != null && !orderedLists.isEmpty();
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
			return listItems != null && !listItems.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
			return footers != null && !footers.isEmpty();
		case ProjektPackage.BODY_ELEMENT__HEADERS:
			return headers != null && !headers.isEmpty();
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
			return hyperLinks != null && !hyperLinks.isEmpty();
		case ProjektPackage.BODY_ELEMENT__IMAGES:
			return images != null && !images.isEmpty();
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
			return boldTexts != null && !boldTexts.isEmpty();
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
			return italicTexts != null && !italicTexts.isEmpty();
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
			return underlineTexts != null && !underlineTexts.isEmpty();
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
			return lineBreaks != null && !lineBreaks.isEmpty();
		case ProjektPackage.BODY_ELEMENT__CODES:
			return codes != null && !codes.isEmpty();
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
			return plainTexts != null && !plainTexts.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FORMS:
			return forms != null && !forms.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
			return formLabels != null && !formLabels.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
			return formFields != null && !formFields.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
			return formButtons != null && !formButtons.isEmpty();
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
			return formCheckBoxRadios != null && !formCheckBoxRadios.isEmpty();
		case ProjektPackage.BODY_ELEMENT__TABLES:
			return tables != null && !tables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //BodyElementImpl
