/**
 */
package projekt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projekt.ProjektFactory
 * @model kind="package"
 * @generated
 */
public interface ProjektPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projekt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projekt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projekt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjektPackage eINSTANCE = projekt.impl.ProjektPackageImpl.init();

	/**
	 * The meta object id for the '{@link projekt.impl.HtmlImpl <em>Html</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.HtmlImpl
	 * @see projekt.impl.ProjektPackageImpl#getHtml()
	 * @generated
	 */
	int HTML = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__BODY = 1;

	/**
	 * The number of structural features of the '<em>Html</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Html</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.HeadImpl
	 * @see projekt.impl.ProjektPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 1;

	/**
	 * The feature id for the '<em><b>Metas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__METAS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Bases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__BASES = 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__LINKS = 3;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__STYLES = 4;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.MetaImpl
	 * @see projekt.impl.ProjektPackageImpl#getMeta()
	 * @generated
	 */
	int META = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.TitleImpl
	 * @see projekt.impl.ProjektPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.BaseImpl
	 * @see projekt.impl.ProjektPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.LinkImpl
	 * @see projekt.impl.ProjektPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.StyleImpl
	 * @see projekt.impl.ProjektPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.BodyImpl
	 * @see projekt.impl.ProjektPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 7;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.HeadingImpl
	 * @see projekt.impl.ProjektPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 8;

	/**
	 * The feature id for the '<em><b>Hnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__HNUMBER = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.BodyElementImpl <em>Body Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.BodyElementImpl
	 * @see projekt.impl.ProjektPackageImpl#getBodyElement()
	 * @generated
	 */
	int BODY_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__BODY_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Headings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__HEADINGS = 2;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__PARAGRAPHS = 3;

	/**
	 * The feature id for the '<em><b>Divs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__DIVS = 4;

	/**
	 * The feature id for the '<em><b>Spans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__SPANS = 5;

	/**
	 * The feature id for the '<em><b>Unordered Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__UNORDERED_LISTS = 6;

	/**
	 * The feature id for the '<em><b>Ordered Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__ORDERED_LISTS = 7;

	/**
	 * The feature id for the '<em><b>List Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__LIST_ITEMS = 8;

	/**
	 * The feature id for the '<em><b>Footers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FOOTERS = 9;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__HEADERS = 10;

	/**
	 * The feature id for the '<em><b>Hyper Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__HYPER_LINKS = 11;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__IMAGES = 12;

	/**
	 * The feature id for the '<em><b>Bold Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__BOLD_TEXTS = 13;

	/**
	 * The feature id for the '<em><b>Italic Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__ITALIC_TEXTS = 14;

	/**
	 * The feature id for the '<em><b>Underline Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__UNDERLINE_TEXTS = 15;

	/**
	 * The feature id for the '<em><b>Line Breaks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__LINE_BREAKS = 16;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__CODES = 17;

	/**
	 * The feature id for the '<em><b>Plain Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__PLAIN_TEXTS = 18;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FORMS = 19;

	/**
	 * The feature id for the '<em><b>Form Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FORM_LABELS = 20;

	/**
	 * The feature id for the '<em><b>Form Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FORM_FIELDS = 21;

	/**
	 * The feature id for the '<em><b>Form Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FORM_BUTTONS = 22;

	/**
	 * The feature id for the '<em><b>Form Check Box Radios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__FORM_CHECK_BOX_RADIOS = 23;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__TABLES = 24;

	/**
	 * The number of structural features of the '<em>Body Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Body Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.ParagraphImpl
	 * @see projekt.impl.ProjektPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 10;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.DivImpl
	 * @see projekt.impl.ProjektPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 11;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.SpanImpl
	 * @see projekt.impl.ProjektPackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 12;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.ListItemImpl
	 * @see projekt.impl.ProjektPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__TEXT = 1;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.UnorderedListImpl <em>Unordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.UnorderedListImpl
	 * @see projekt.impl.ProjektPackageImpl#getUnorderedList()
	 * @generated
	 */
	int UNORDERED_LIST = 14;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.OrderedListImpl
	 * @see projekt.impl.ProjektPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 15;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.HyperLinkImpl
	 * @see projekt.impl.ProjektPackageImpl#getHyperLink()
	 * @generated
	 */
	int HYPER_LINK = 16;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__LINK = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Hyper Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hyper Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.ImageImpl
	 * @see projekt.impl.ProjektPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINK = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.BoldTextImpl <em>Bold Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.BoldTextImpl
	 * @see projekt.impl.ProjektPackageImpl#getBoldText()
	 * @generated
	 */
	int BOLD_TEXT = 18;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.ItalicTextImpl <em>Italic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.ItalicTextImpl
	 * @see projekt.impl.ProjektPackageImpl#getItalicText()
	 * @generated
	 */
	int ITALIC_TEXT = 19;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.UnderlineTextImpl <em>Underline Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.UnderlineTextImpl
	 * @see projekt.impl.ProjektPackageImpl#getUnderlineText()
	 * @generated
	 */
	int UNDERLINE_TEXT = 20;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Underline Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Underline Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.LineBreakImpl
	 * @see projekt.impl.ProjektPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 21;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.CodeImpl
	 * @see projekt.impl.ProjektPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 22;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.PlainTextImpl <em>Plain Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.PlainTextImpl
	 * @see projekt.impl.ProjektPackageImpl#getPlainText()
	 * @generated
	 */
	int PLAIN_TEXT = 23;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Plain Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plain Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FormImpl
	 * @see projekt.impl.ProjektPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 24;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FooterImpl <em>Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FooterImpl
	 * @see projekt.impl.ProjektPackageImpl#getFooter()
	 * @generated
	 */
	int FOOTER = 25;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.HeaderImpl
	 * @see projekt.impl.ProjektPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 26;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FormLabelImpl <em>Form Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FormLabelImpl
	 * @see projekt.impl.ProjektPackageImpl#getFormLabel()
	 * @generated
	 */
	int FORM_LABEL = 27;

	/**
	 * The feature id for the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__LABEL_NAME = 0;

	/**
	 * The number of structural features of the '<em>Form Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FormFieldImpl <em>Form Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FormFieldImpl
	 * @see projekt.impl.ProjektPackageImpl#getFormField()
	 * @generated
	 */
	int FORM_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__LABEL_NAME = 2;

	/**
	 * The number of structural features of the '<em>Form Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FormButtonImpl <em>Form Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FormButtonImpl
	 * @see projekt.impl.ProjektPackageImpl#getFormButton()
	 * @generated
	 */
	int FORM_BUTTON = 29;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Form Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Form Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_BUTTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.FormCheckBoxRadioImpl <em>Form Check Box Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.FormCheckBoxRadioImpl
	 * @see projekt.impl.ProjektPackageImpl#getFormCheckBoxRadio()
	 * @generated
	 */
	int FORM_CHECK_BOX_RADIO = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_BOX_RADIO__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_BOX_RADIO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_BOX_RADIO__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Form Check Box Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_BOX_RADIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Check Box Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_BOX_RADIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.TableImpl
	 * @see projekt.impl.ProjektPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 31;

	/**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_ROWS = 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.TableRowImpl
	 * @see projekt.impl.ProjektPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 32;

	/**
	 * The feature id for the '<em><b>Table Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLE_CELLS = 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projekt.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projekt.impl.TableCellImpl
	 * @see projekt.impl.ProjektPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 33;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__BODY_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link projekt.Html <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html</em>'.
	 * @see projekt.Html
	 * @generated
	 */
	EClass getHtml();

	/**
	 * Returns the meta object for the containment reference '{@link projekt.Html#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see projekt.Html#getHead()
	 * @see #getHtml()
	 * @generated
	 */
	EReference getHtml_Head();

	/**
	 * Returns the meta object for the containment reference '{@link projekt.Html#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see projekt.Html#getBody()
	 * @see #getHtml()
	 * @generated
	 */
	EReference getHtml_Body();

	/**
	 * Returns the meta object for class '{@link projekt.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see projekt.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Head#getMetas <em>Metas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metas</em>'.
	 * @see projekt.Head#getMetas()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Metas();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Head#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titles</em>'.
	 * @see projekt.Head#getTitles()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Head#getBases <em>Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bases</em>'.
	 * @see projekt.Head#getBases()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Bases();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Head#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see projekt.Head#getLinks()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Head#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see projekt.Head#getStyles()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_Styles();

	/**
	 * Returns the meta object for class '{@link projekt.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see projekt.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Meta#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Meta#getText()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see projekt.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Title#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Title#getText()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see projekt.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Base#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Base#getText()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see projekt.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see projekt.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Style#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Style#getText()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see projekt.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Body#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Body#getBodyElements()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Body#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Body#getText()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see projekt.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Heading#getH_number <em>Hnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hnumber</em>'.
	 * @see projekt.Heading#getH_number()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_H_number();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Heading#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Heading#getText()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Text();

	/**
	 * Returns the meta object for class '{@link projekt.BodyElement <em>Body Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Element</em>'.
	 * @see projekt.BodyElement
	 * @generated
	 */
	EClass getBodyElement();

	/**
	 * Returns the meta object for the attribute '{@link projekt.BodyElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.BodyElement#getText()
	 * @see #getBodyElement()
	 * @generated
	 */
	EAttribute getBodyElement_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.BodyElement#getBodyElements()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_BodyElements();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getHeadings <em>Headings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headings</em>'.
	 * @see projekt.BodyElement#getHeadings()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Headings();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see projekt.BodyElement#getParagraphs()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Paragraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getDivs <em>Divs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divs</em>'.
	 * @see projekt.BodyElement#getDivs()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Divs();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getSpans <em>Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spans</em>'.
	 * @see projekt.BodyElement#getSpans()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Spans();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getUnorderedLists <em>Unordered Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unordered Lists</em>'.
	 * @see projekt.BodyElement#getUnorderedLists()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_UnorderedLists();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getOrderedLists <em>Ordered Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordered Lists</em>'.
	 * @see projekt.BodyElement#getOrderedLists()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_OrderedLists();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getListItems <em>List Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Items</em>'.
	 * @see projekt.BodyElement#getListItems()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_ListItems();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getFooters <em>Footers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footers</em>'.
	 * @see projekt.BodyElement#getFooters()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Footers();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see projekt.BodyElement#getHeaders()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getHyperLinks <em>Hyper Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyper Links</em>'.
	 * @see projekt.BodyElement#getHyperLinks()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_HyperLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see projekt.BodyElement#getImages()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getBoldTexts <em>Bold Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bold Texts</em>'.
	 * @see projekt.BodyElement#getBoldTexts()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_BoldTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getItalicTexts <em>Italic Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Italic Texts</em>'.
	 * @see projekt.BodyElement#getItalicTexts()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_ItalicTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getUnderlineTexts <em>Underline Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Underline Texts</em>'.
	 * @see projekt.BodyElement#getUnderlineTexts()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_UnderlineTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getLineBreaks <em>Line Breaks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Breaks</em>'.
	 * @see projekt.BodyElement#getLineBreaks()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_LineBreaks();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codes</em>'.
	 * @see projekt.BodyElement#getCodes()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Codes();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getPlainTexts <em>Plain Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plain Texts</em>'.
	 * @see projekt.BodyElement#getPlainTexts()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_PlainTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see projekt.BodyElement#getForms()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getFormLabels <em>Form Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Labels</em>'.
	 * @see projekt.BodyElement#getFormLabels()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_FormLabels();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getFormFields <em>Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Fields</em>'.
	 * @see projekt.BodyElement#getFormFields()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_FormFields();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getFormButtons <em>Form Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Buttons</em>'.
	 * @see projekt.BodyElement#getFormButtons()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_FormButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getFormCheckBoxRadios <em>Form Check Box Radios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Check Box Radios</em>'.
	 * @see projekt.BodyElement#getFormCheckBoxRadios()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_FormCheckBoxRadios();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.BodyElement#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see projekt.BodyElement#getTables()
	 * @see #getBodyElement()
	 * @generated
	 */
	EReference getBodyElement_Tables();

	/**
	 * Returns the meta object for class '{@link projekt.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see projekt.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Paragraph#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Paragraph#getBodyElements()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see projekt.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Div#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Div#getBodyElements()
	 * @see #getDiv()
	 * @generated
	 */
	EReference getDiv_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Div#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Div#getText()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see projekt.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Span#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Span#getBodyElements()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Span#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Span#getText()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Text();

	/**
	 * Returns the meta object for class '{@link projekt.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see projekt.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.ListItem#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.ListItem#getBodyElements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.ListItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.ListItem#getText()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Text();

	/**
	 * Returns the meta object for class '{@link projekt.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List</em>'.
	 * @see projekt.UnorderedList
	 * @generated
	 */
	EClass getUnorderedList();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.UnorderedList#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.UnorderedList#getBodyElements()
	 * @see #getUnorderedList()
	 * @generated
	 */
	EReference getUnorderedList_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.UnorderedList#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.UnorderedList#getText()
	 * @see #getUnorderedList()
	 * @generated
	 */
	EAttribute getUnorderedList_Text();

	/**
	 * Returns the meta object for class '{@link projekt.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see projekt.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.OrderedList#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.OrderedList#getBodyElements()
	 * @see #getOrderedList()
	 * @generated
	 */
	EReference getOrderedList_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.OrderedList#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.OrderedList#getText()
	 * @see #getOrderedList()
	 * @generated
	 */
	EAttribute getOrderedList_Text();

	/**
	 * Returns the meta object for class '{@link projekt.HyperLink <em>Hyper Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Link</em>'.
	 * @see projekt.HyperLink
	 * @generated
	 */
	EClass getHyperLink();

	/**
	 * Returns the meta object for the attribute '{@link projekt.HyperLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see projekt.HyperLink#getLink()
	 * @see #getHyperLink()
	 * @generated
	 */
	EAttribute getHyperLink_Link();

	/**
	 * Returns the meta object for the attribute '{@link projekt.HyperLink#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.HyperLink#getText()
	 * @see #getHyperLink()
	 * @generated
	 */
	EAttribute getHyperLink_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see projekt.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Image#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see projekt.Image#getLink()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Link();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Image#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Image#getText()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Text();

	/**
	 * Returns the meta object for class '{@link projekt.BoldText <em>Bold Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Text</em>'.
	 * @see projekt.BoldText
	 * @generated
	 */
	EClass getBoldText();

	/**
	 * Returns the meta object for the attribute '{@link projekt.BoldText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.BoldText#getText()
	 * @see #getBoldText()
	 * @generated
	 */
	EAttribute getBoldText_Text();

	/**
	 * Returns the meta object for class '{@link projekt.ItalicText <em>Italic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Text</em>'.
	 * @see projekt.ItalicText
	 * @generated
	 */
	EClass getItalicText();

	/**
	 * Returns the meta object for the attribute '{@link projekt.ItalicText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.ItalicText#getText()
	 * @see #getItalicText()
	 * @generated
	 */
	EAttribute getItalicText_Text();

	/**
	 * Returns the meta object for class '{@link projekt.UnderlineText <em>Underline Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline Text</em>'.
	 * @see projekt.UnderlineText
	 * @generated
	 */
	EClass getUnderlineText();

	/**
	 * Returns the meta object for the attribute '{@link projekt.UnderlineText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.UnderlineText#getText()
	 * @see #getUnderlineText()
	 * @generated
	 */
	EAttribute getUnderlineText_Text();

	/**
	 * Returns the meta object for class '{@link projekt.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see projekt.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for class '{@link projekt.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see projekt.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Code#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Code#getText()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Text();

	/**
	 * Returns the meta object for class '{@link projekt.PlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Text</em>'.
	 * @see projekt.PlainText
	 * @generated
	 */
	EClass getPlainText();

	/**
	 * Returns the meta object for the attribute '{@link projekt.PlainText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.PlainText#getText()
	 * @see #getPlainText()
	 * @generated
	 */
	EAttribute getPlainText_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see projekt.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Form#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Form#getBodyElements()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Form#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Form#getText()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Footer <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer</em>'.
	 * @see projekt.Footer
	 * @generated
	 */
	EClass getFooter();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Footer#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Footer#getBodyElements()
	 * @see #getFooter()
	 * @generated
	 */
	EReference getFooter_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Footer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Footer#getText()
	 * @see #getFooter()
	 * @generated
	 */
	EAttribute getFooter_Text();

	/**
	 * Returns the meta object for class '{@link projekt.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see projekt.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Header#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.Header#getBodyElements()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.Header#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.Header#getText()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Text();

	/**
	 * Returns the meta object for class '{@link projekt.FormLabel <em>Form Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Label</em>'.
	 * @see projekt.FormLabel
	 * @generated
	 */
	EClass getFormLabel();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormLabel#getLabel_name <em>Label name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label name</em>'.
	 * @see projekt.FormLabel#getLabel_name()
	 * @see #getFormLabel()
	 * @generated
	 */
	EAttribute getFormLabel_Label_name();

	/**
	 * Returns the meta object for class '{@link projekt.FormField <em>Form Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Field</em>'.
	 * @see projekt.FormField
	 * @generated
	 */
	EClass getFormField();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projekt.FormField#getType()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Type();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projekt.FormField#getName()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Name();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormField#getLabel_name <em>Label name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label name</em>'.
	 * @see projekt.FormField#getLabel_name()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Label_name();

	/**
	 * Returns the meta object for class '{@link projekt.FormButton <em>Form Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Button</em>'.
	 * @see projekt.FormButton
	 * @generated
	 */
	EClass getFormButton();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormButton#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projekt.FormButton#getType()
	 * @see #getFormButton()
	 * @generated
	 */
	EAttribute getFormButton_Type();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormButton#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projekt.FormButton#getValue()
	 * @see #getFormButton()
	 * @generated
	 */
	EAttribute getFormButton_Value();

	/**
	 * Returns the meta object for class '{@link projekt.FormCheckBoxRadio <em>Form Check Box Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Check Box Radio</em>'.
	 * @see projekt.FormCheckBoxRadio
	 * @generated
	 */
	EClass getFormCheckBoxRadio();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormCheckBoxRadio#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projekt.FormCheckBoxRadio#getType()
	 * @see #getFormCheckBoxRadio()
	 * @generated
	 */
	EAttribute getFormCheckBoxRadio_Type();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormCheckBoxRadio#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projekt.FormCheckBoxRadio#getName()
	 * @see #getFormCheckBoxRadio()
	 * @generated
	 */
	EAttribute getFormCheckBoxRadio_Name();

	/**
	 * Returns the meta object for the attribute '{@link projekt.FormCheckBoxRadio#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projekt.FormCheckBoxRadio#getValue()
	 * @see #getFormCheckBoxRadio()
	 * @generated
	 */
	EAttribute getFormCheckBoxRadio_Value();

	/**
	 * Returns the meta object for class '{@link projekt.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see projekt.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.Table#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows</em>'.
	 * @see projekt.Table#getTableRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableRows();

	/**
	 * Returns the meta object for class '{@link projekt.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see projekt.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.TableRow#getTableCells <em>Table Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Cells</em>'.
	 * @see projekt.TableRow#getTableCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_TableCells();

	/**
	 * Returns the meta object for class '{@link projekt.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see projekt.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the containment reference list '{@link projekt.TableCell#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Elements</em>'.
	 * @see projekt.TableCell#getBodyElements()
	 * @see #getTableCell()
	 * @generated
	 */
	EReference getTableCell_BodyElements();

	/**
	 * Returns the meta object for the attribute '{@link projekt.TableCell#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projekt.TableCell#getText()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjektFactory getProjektFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projekt.impl.HtmlImpl <em>Html</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.HtmlImpl
		 * @see projekt.impl.ProjektPackageImpl#getHtml()
		 * @generated
		 */
		EClass HTML = eINSTANCE.getHtml();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML__HEAD = eINSTANCE.getHtml_Head();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML__BODY = eINSTANCE.getHtml_Body();

		/**
		 * The meta object literal for the '{@link projekt.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.HeadImpl
		 * @see projekt.impl.ProjektPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '<em><b>Metas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__METAS = eINSTANCE.getHead_Metas();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__TITLES = eINSTANCE.getHead_Titles();

		/**
		 * The meta object literal for the '<em><b>Bases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__BASES = eINSTANCE.getHead_Bases();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__LINKS = eINSTANCE.getHead_Links();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__STYLES = eINSTANCE.getHead_Styles();

		/**
		 * The meta object literal for the '{@link projekt.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.MetaImpl
		 * @see projekt.impl.ProjektPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__TEXT = eINSTANCE.getMeta_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.TitleImpl
		 * @see projekt.impl.ProjektPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__TEXT = eINSTANCE.getTitle_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.BaseImpl
		 * @see projekt.impl.ProjektPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__TEXT = eINSTANCE.getBase_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.LinkImpl
		 * @see projekt.impl.ProjektPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.StyleImpl
		 * @see projekt.impl.ProjektPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__TEXT = eINSTANCE.getStyle_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.BodyImpl
		 * @see projekt.impl.ProjektPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__BODY_ELEMENTS = eINSTANCE.getBody_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__TEXT = eINSTANCE.getBody_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.HeadingImpl
		 * @see projekt.impl.ProjektPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Hnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__HNUMBER = eINSTANCE.getHeading_H_number();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__TEXT = eINSTANCE.getHeading_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.BodyElementImpl <em>Body Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.BodyElementImpl
		 * @see projekt.impl.ProjektPackageImpl#getBodyElement()
		 * @generated
		 */
		EClass BODY_ELEMENT = eINSTANCE.getBodyElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_ELEMENT__TEXT = eINSTANCE.getBodyElement_Text();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__BODY_ELEMENTS = eINSTANCE.getBodyElement_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Headings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__HEADINGS = eINSTANCE.getBodyElement_Headings();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__PARAGRAPHS = eINSTANCE.getBodyElement_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Divs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__DIVS = eINSTANCE.getBodyElement_Divs();

		/**
		 * The meta object literal for the '<em><b>Spans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__SPANS = eINSTANCE.getBodyElement_Spans();

		/**
		 * The meta object literal for the '<em><b>Unordered Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__UNORDERED_LISTS = eINSTANCE.getBodyElement_UnorderedLists();

		/**
		 * The meta object literal for the '<em><b>Ordered Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__ORDERED_LISTS = eINSTANCE.getBodyElement_OrderedLists();

		/**
		 * The meta object literal for the '<em><b>List Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__LIST_ITEMS = eINSTANCE.getBodyElement_ListItems();

		/**
		 * The meta object literal for the '<em><b>Footers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FOOTERS = eINSTANCE.getBodyElement_Footers();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__HEADERS = eINSTANCE.getBodyElement_Headers();

		/**
		 * The meta object literal for the '<em><b>Hyper Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__HYPER_LINKS = eINSTANCE.getBodyElement_HyperLinks();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__IMAGES = eINSTANCE.getBodyElement_Images();

		/**
		 * The meta object literal for the '<em><b>Bold Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__BOLD_TEXTS = eINSTANCE.getBodyElement_BoldTexts();

		/**
		 * The meta object literal for the '<em><b>Italic Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__ITALIC_TEXTS = eINSTANCE.getBodyElement_ItalicTexts();

		/**
		 * The meta object literal for the '<em><b>Underline Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__UNDERLINE_TEXTS = eINSTANCE.getBodyElement_UnderlineTexts();

		/**
		 * The meta object literal for the '<em><b>Line Breaks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__LINE_BREAKS = eINSTANCE.getBodyElement_LineBreaks();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__CODES = eINSTANCE.getBodyElement_Codes();

		/**
		 * The meta object literal for the '<em><b>Plain Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__PLAIN_TEXTS = eINSTANCE.getBodyElement_PlainTexts();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FORMS = eINSTANCE.getBodyElement_Forms();

		/**
		 * The meta object literal for the '<em><b>Form Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FORM_LABELS = eINSTANCE.getBodyElement_FormLabels();

		/**
		 * The meta object literal for the '<em><b>Form Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FORM_FIELDS = eINSTANCE.getBodyElement_FormFields();

		/**
		 * The meta object literal for the '<em><b>Form Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FORM_BUTTONS = eINSTANCE.getBodyElement_FormButtons();

		/**
		 * The meta object literal for the '<em><b>Form Check Box Radios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__FORM_CHECK_BOX_RADIOS = eINSTANCE.getBodyElement_FormCheckBoxRadios();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__TABLES = eINSTANCE.getBodyElement_Tables();

		/**
		 * The meta object literal for the '{@link projekt.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.ParagraphImpl
		 * @see projekt.impl.ProjektPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__BODY_ELEMENTS = eINSTANCE.getParagraph_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.DivImpl
		 * @see projekt.impl.ProjektPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIV__BODY_ELEMENTS = eINSTANCE.getDiv_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__TEXT = eINSTANCE.getDiv_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.SpanImpl
		 * @see projekt.impl.ProjektPackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__BODY_ELEMENTS = eINSTANCE.getSpan_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__TEXT = eINSTANCE.getSpan_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.ListItemImpl
		 * @see projekt.impl.ProjektPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__BODY_ELEMENTS = eINSTANCE.getListItem_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__TEXT = eINSTANCE.getListItem_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.UnorderedListImpl <em>Unordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.UnorderedListImpl
		 * @see projekt.impl.ProjektPackageImpl#getUnorderedList()
		 * @generated
		 */
		EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNORDERED_LIST__BODY_ELEMENTS = eINSTANCE.getUnorderedList_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNORDERED_LIST__TEXT = eINSTANCE.getUnorderedList_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.OrderedListImpl
		 * @see projekt.impl.ProjektPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST__BODY_ELEMENTS = eINSTANCE.getOrderedList_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERED_LIST__TEXT = eINSTANCE.getOrderedList_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.HyperLinkImpl
		 * @see projekt.impl.ProjektPackageImpl#getHyperLink()
		 * @generated
		 */
		EClass HYPER_LINK = eINSTANCE.getHyperLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_LINK__LINK = eINSTANCE.getHyperLink_Link();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_LINK__TEXT = eINSTANCE.getHyperLink_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.ImageImpl
		 * @see projekt.impl.ProjektPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LINK = eINSTANCE.getImage_Link();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TEXT = eINSTANCE.getImage_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.BoldTextImpl <em>Bold Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.BoldTextImpl
		 * @see projekt.impl.ProjektPackageImpl#getBoldText()
		 * @generated
		 */
		EClass BOLD_TEXT = eINSTANCE.getBoldText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOLD_TEXT__TEXT = eINSTANCE.getBoldText_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.ItalicTextImpl <em>Italic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.ItalicTextImpl
		 * @see projekt.impl.ProjektPackageImpl#getItalicText()
		 * @generated
		 */
		EClass ITALIC_TEXT = eINSTANCE.getItalicText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITALIC_TEXT__TEXT = eINSTANCE.getItalicText_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.UnderlineTextImpl <em>Underline Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.UnderlineTextImpl
		 * @see projekt.impl.ProjektPackageImpl#getUnderlineText()
		 * @generated
		 */
		EClass UNDERLINE_TEXT = eINSTANCE.getUnderlineText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDERLINE_TEXT__TEXT = eINSTANCE.getUnderlineText_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.LineBreakImpl
		 * @see projekt.impl.ProjektPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link projekt.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.CodeImpl
		 * @see projekt.impl.ProjektPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__TEXT = eINSTANCE.getCode_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.PlainTextImpl <em>Plain Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.PlainTextImpl
		 * @see projekt.impl.ProjektPackageImpl#getPlainText()
		 * @generated
		 */
		EClass PLAIN_TEXT = eINSTANCE.getPlainText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXT__TEXT = eINSTANCE.getPlainText_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FormImpl
		 * @see projekt.impl.ProjektPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__BODY_ELEMENTS = eINSTANCE.getForm_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TEXT = eINSTANCE.getForm_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.FooterImpl <em>Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FooterImpl
		 * @see projekt.impl.ProjektPackageImpl#getFooter()
		 * @generated
		 */
		EClass FOOTER = eINSTANCE.getFooter();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTER__BODY_ELEMENTS = eINSTANCE.getFooter_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER__TEXT = eINSTANCE.getFooter_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.HeaderImpl
		 * @see projekt.impl.ProjektPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__BODY_ELEMENTS = eINSTANCE.getHeader_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TEXT = eINSTANCE.getHeader_Text();

		/**
		 * The meta object literal for the '{@link projekt.impl.FormLabelImpl <em>Form Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FormLabelImpl
		 * @see projekt.impl.ProjektPackageImpl#getFormLabel()
		 * @generated
		 */
		EClass FORM_LABEL = eINSTANCE.getFormLabel();

		/**
		 * The meta object literal for the '<em><b>Label name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LABEL__LABEL_NAME = eINSTANCE.getFormLabel_Label_name();

		/**
		 * The meta object literal for the '{@link projekt.impl.FormFieldImpl <em>Form Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FormFieldImpl
		 * @see projekt.impl.ProjektPackageImpl#getFormField()
		 * @generated
		 */
		EClass FORM_FIELD = eINSTANCE.getFormField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__TYPE = eINSTANCE.getFormField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__NAME = eINSTANCE.getFormField_Name();

		/**
		 * The meta object literal for the '<em><b>Label name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__LABEL_NAME = eINSTANCE.getFormField_Label_name();

		/**
		 * The meta object literal for the '{@link projekt.impl.FormButtonImpl <em>Form Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FormButtonImpl
		 * @see projekt.impl.ProjektPackageImpl#getFormButton()
		 * @generated
		 */
		EClass FORM_BUTTON = eINSTANCE.getFormButton();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_BUTTON__TYPE = eINSTANCE.getFormButton_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_BUTTON__VALUE = eINSTANCE.getFormButton_Value();

		/**
		 * The meta object literal for the '{@link projekt.impl.FormCheckBoxRadioImpl <em>Form Check Box Radio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.FormCheckBoxRadioImpl
		 * @see projekt.impl.ProjektPackageImpl#getFormCheckBoxRadio()
		 * @generated
		 */
		EClass FORM_CHECK_BOX_RADIO = eINSTANCE.getFormCheckBoxRadio();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK_BOX_RADIO__TYPE = eINSTANCE.getFormCheckBoxRadio_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK_BOX_RADIO__NAME = eINSTANCE.getFormCheckBoxRadio_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK_BOX_RADIO__VALUE = eINSTANCE.getFormCheckBoxRadio_Value();

		/**
		 * The meta object literal for the '{@link projekt.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.TableImpl
		 * @see projekt.impl.ProjektPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_ROWS = eINSTANCE.getTable_TableRows();

		/**
		 * The meta object literal for the '{@link projekt.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.TableRowImpl
		 * @see projekt.impl.ProjektPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Table Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__TABLE_CELLS = eINSTANCE.getTableRow_TableCells();

		/**
		 * The meta object literal for the '{@link projekt.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projekt.impl.TableCellImpl
		 * @see projekt.impl.ProjektPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL__BODY_ELEMENTS = eINSTANCE.getTableCell_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__TEXT = eINSTANCE.getTableCell_Text();

	}

} //ProjektPackage
