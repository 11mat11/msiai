/**
 */
package projekt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projekt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjektFactoryImpl extends EFactoryImpl implements ProjektFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjektFactory init() {
		try {
			ProjektFactory theProjektFactory = (ProjektFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjektPackage.eNS_URI);
			if (theProjektFactory != null) {
				return theProjektFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjektFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjektFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjektPackage.HTML:
			return createHtml();
		case ProjektPackage.HEAD:
			return createHead();
		case ProjektPackage.META:
			return createMeta();
		case ProjektPackage.TITLE:
			return createTitle();
		case ProjektPackage.BASE:
			return createBase();
		case ProjektPackage.LINK:
			return createLink();
		case ProjektPackage.STYLE:
			return createStyle();
		case ProjektPackage.BODY:
			return createBody();
		case ProjektPackage.HEADING:
			return createHeading();
		case ProjektPackage.BODY_ELEMENT:
			return createBodyElement();
		case ProjektPackage.PARAGRAPH:
			return createParagraph();
		case ProjektPackage.DIV:
			return createDiv();
		case ProjektPackage.SPAN:
			return createSpan();
		case ProjektPackage.LIST_ITEM:
			return createListItem();
		case ProjektPackage.UNORDERED_LIST:
			return createUnorderedList();
		case ProjektPackage.ORDERED_LIST:
			return createOrderedList();
		case ProjektPackage.HYPER_LINK:
			return createHyperLink();
		case ProjektPackage.IMAGE:
			return createImage();
		case ProjektPackage.BOLD_TEXT:
			return createBoldText();
		case ProjektPackage.ITALIC_TEXT:
			return createItalicText();
		case ProjektPackage.UNDERLINE_TEXT:
			return createUnderlineText();
		case ProjektPackage.LINE_BREAK:
			return createLineBreak();
		case ProjektPackage.CODE:
			return createCode();
		case ProjektPackage.PLAIN_TEXT:
			return createPlainText();
		case ProjektPackage.FORM:
			return createForm();
		case ProjektPackage.FOOTER:
			return createFooter();
		case ProjektPackage.HEADER:
			return createHeader();
		case ProjektPackage.FORM_LABEL:
			return createFormLabel();
		case ProjektPackage.FORM_FIELD:
			return createFormField();
		case ProjektPackage.FORM_BUTTON:
			return createFormButton();
		case ProjektPackage.FORM_CHECK_BOX_RADIO:
			return createFormCheckBoxRadio();
		case ProjektPackage.TABLE:
			return createTable();
		case ProjektPackage.TABLE_ROW:
			return createTableRow();
		case ProjektPackage.TABLE_CELL:
			return createTableCell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Html createHtml() {
		HtmlImpl html = new HtmlImpl();
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heading createHeading() {
		HeadingImpl heading = new HeadingImpl();
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyElement createBodyElement() {
		BodyElementImpl bodyElement = new BodyElementImpl();
		return bodyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnorderedList createUnorderedList() {
		UnorderedListImpl unorderedList = new UnorderedListImpl();
		return unorderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedList createOrderedList() {
		OrderedListImpl orderedList = new OrderedListImpl();
		return orderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyperLink createHyperLink() {
		HyperLinkImpl hyperLink = new HyperLinkImpl();
		return hyperLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoldText createBoldText() {
		BoldTextImpl boldText = new BoldTextImpl();
		return boldText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItalicText createItalicText() {
		ItalicTextImpl italicText = new ItalicTextImpl();
		return italicText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnderlineText createUnderlineText() {
		UnderlineTextImpl underlineText = new UnderlineTextImpl();
		return underlineText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineBreak createLineBreak() {
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlainText createPlainText() {
		PlainTextImpl plainText = new PlainTextImpl();
		return plainText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Footer createFooter() {
		FooterImpl footer = new FooterImpl();
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormLabel createFormLabel() {
		FormLabelImpl formLabel = new FormLabelImpl();
		return formLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormField createFormField() {
		FormFieldImpl formField = new FormFieldImpl();
		return formField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormButton createFormButton() {
		FormButtonImpl formButton = new FormButtonImpl();
		return formButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormCheckBoxRadio createFormCheckBoxRadio() {
		FormCheckBoxRadioImpl formCheckBoxRadio = new FormCheckBoxRadioImpl();
		return formCheckBoxRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjektPackage getProjektPackage() {
		return (ProjektPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjektPackage getPackage() {
		return ProjektPackage.eINSTANCE;
	}

} //ProjektFactoryImpl
