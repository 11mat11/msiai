/**
 */
package projekt.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import projekt.BodyElement;
import projekt.ProjektFactory;
import projekt.ProjektPackage;

/**
 * This is the item provider adapter for a {@link projekt.BodyElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BodyElementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BodyElement_text_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BodyElement_text_feature",
								"_UI_BodyElement_type"),
						ProjektPackage.Literals.BODY_ELEMENT__TEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__BODY_ELEMENTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__HEADINGS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__PARAGRAPHS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__DIVS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__SPANS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__UNORDERED_LISTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__ORDERED_LISTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__LIST_ITEMS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FOOTERS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__HEADERS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__HYPER_LINKS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__IMAGES);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__BOLD_TEXTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__ITALIC_TEXTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__UNDERLINE_TEXTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__LINE_BREAKS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__CODES);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__PLAIN_TEXTS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FORMS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FORM_LABELS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FORM_FIELDS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FORM_BUTTONS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS);
			childrenFeatures.add(ProjektPackage.Literals.BODY_ELEMENT__TABLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BodyElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BodyElement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BodyElement) object).getText();
		return label == null || label.length() == 0 ? getString("_UI_BodyElement_type")
				: getString("_UI_BodyElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BodyElement.class)) {
		case ProjektPackage.BODY_ELEMENT__TEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ProjektPackage.BODY_ELEMENT__BODY_ELEMENTS:
		case ProjektPackage.BODY_ELEMENT__HEADINGS:
		case ProjektPackage.BODY_ELEMENT__PARAGRAPHS:
		case ProjektPackage.BODY_ELEMENT__DIVS:
		case ProjektPackage.BODY_ELEMENT__SPANS:
		case ProjektPackage.BODY_ELEMENT__UNORDERED_LISTS:
		case ProjektPackage.BODY_ELEMENT__ORDERED_LISTS:
		case ProjektPackage.BODY_ELEMENT__LIST_ITEMS:
		case ProjektPackage.BODY_ELEMENT__FOOTERS:
		case ProjektPackage.BODY_ELEMENT__HEADERS:
		case ProjektPackage.BODY_ELEMENT__HYPER_LINKS:
		case ProjektPackage.BODY_ELEMENT__IMAGES:
		case ProjektPackage.BODY_ELEMENT__BOLD_TEXTS:
		case ProjektPackage.BODY_ELEMENT__ITALIC_TEXTS:
		case ProjektPackage.BODY_ELEMENT__UNDERLINE_TEXTS:
		case ProjektPackage.BODY_ELEMENT__LINE_BREAKS:
		case ProjektPackage.BODY_ELEMENT__CODES:
		case ProjektPackage.BODY_ELEMENT__PLAIN_TEXTS:
		case ProjektPackage.BODY_ELEMENT__FORMS:
		case ProjektPackage.BODY_ELEMENT__FORM_LABELS:
		case ProjektPackage.BODY_ELEMENT__FORM_FIELDS:
		case ProjektPackage.BODY_ELEMENT__FORM_BUTTONS:
		case ProjektPackage.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS:
		case ProjektPackage.BODY_ELEMENT__TABLES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__BODY_ELEMENTS,
				ProjektFactory.eINSTANCE.createBodyElement()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__HEADINGS,
				ProjektFactory.eINSTANCE.createHeading()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__PARAGRAPHS,
				ProjektFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(
				createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__DIVS, ProjektFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__SPANS,
				ProjektFactory.eINSTANCE.createSpan()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__UNORDERED_LISTS,
				ProjektFactory.eINSTANCE.createUnorderedList()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__ORDERED_LISTS,
				ProjektFactory.eINSTANCE.createOrderedList()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__LIST_ITEMS,
				ProjektFactory.eINSTANCE.createListItem()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FOOTERS,
				ProjektFactory.eINSTANCE.createFooter()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__HEADERS,
				ProjektFactory.eINSTANCE.createHeader()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__HYPER_LINKS,
				ProjektFactory.eINSTANCE.createHyperLink()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__IMAGES,
				ProjektFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__BOLD_TEXTS,
				ProjektFactory.eINSTANCE.createBoldText()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__ITALIC_TEXTS,
				ProjektFactory.eINSTANCE.createItalicText()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__UNDERLINE_TEXTS,
				ProjektFactory.eINSTANCE.createUnderlineText()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__LINE_BREAKS,
				ProjektFactory.eINSTANCE.createLineBreak()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__CODES,
				ProjektFactory.eINSTANCE.createCode()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__PLAIN_TEXTS,
				ProjektFactory.eINSTANCE.createPlainText()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FORMS,
				ProjektFactory.eINSTANCE.createForm()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FORM_LABELS,
				ProjektFactory.eINSTANCE.createFormLabel()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FORM_FIELDS,
				ProjektFactory.eINSTANCE.createFormField()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FORM_BUTTONS,
				ProjektFactory.eINSTANCE.createFormButton()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__FORM_CHECK_BOX_RADIOS,
				ProjektFactory.eINSTANCE.createFormCheckBoxRadio()));

		newChildDescriptors.add(createChildParameter(ProjektPackage.Literals.BODY_ELEMENT__TABLES,
				ProjektFactory.eINSTANCE.createTable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProjektEditPlugin.INSTANCE;
	}

}
