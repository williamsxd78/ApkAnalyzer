package androidx.compose.ui.node;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\tR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\tR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\tR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\tR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\tR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\tR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010\tR!\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010\tR!\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b-\u0010\tR!\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0003\u001a\u0004\b1\u0010\tR!\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b5\u0010\tR!\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0003\u001a\u0004\b9\u0010\tR!\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0003\u001a\u0004\b=\u0010\tR!\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0003\u001a\u0004\bA\u0010\tR!\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bE\u0010\tR!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bI\u0010\tR!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0003\u001a\u0004\bM\u0010\tR!\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0003\u001a\u0004\bQ\u0010\tR!\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0003\u001a\u0004\bU\u0010\tR!\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0003\u001a\u0004\bY\u0010\tR!\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0003\u001a\u0004\b\\\u0010\tR!\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010\u0003\u001a\u0004\b`\u0010\t¨\u0006a"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "<init>", "()V", "Any", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw$annotations", "getAny-OLwlOKw", "()I", PDLayoutAttributeObject.OWNER_LAYOUT, "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw$annotations", "getLayout-OLwlOKw", "Draw", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw$annotations", "getDraw-OLwlOKw", "Semantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw$annotations", "getSemantics-OLwlOKw", "PointerInput", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw$annotations", "getPointerInput-OLwlOKw", "Locals", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getLocals-OLwlOKw$annotations", "getLocals-OLwlOKw", "ParentData", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw$annotations", "getParentData-OLwlOKw", "OnRemeasured", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getOnRemeasured-OLwlOKw$annotations", "getOnRemeasured-OLwlOKw", "GlobalPositionAware", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw$annotations", "getGlobalPositionAware-OLwlOKw", "ApproachMeasure", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachMeasure-OLwlOKw$annotations", "getApproachMeasure-OLwlOKw", "FocusTarget", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTarget-OLwlOKw$annotations", "getFocusTarget-OLwlOKw", "FocusProperties", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw$annotations", "getFocusProperties-OLwlOKw", "FocusEvent", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw$annotations", "getFocusEvent-OLwlOKw", "KeyInput", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw$annotations", "getKeyInput-OLwlOKw", "RotaryInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw$annotations", "getRotaryInput-OLwlOKw", "CompositionLocalConsumer", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "getCompositionLocalConsumer-OLwlOKw$annotations", "getCompositionLocalConsumer-OLwlOKw", "SoftKeyboardKeyInput", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "getSoftKeyboardKeyInput-OLwlOKw$annotations", "getSoftKeyboardKeyInput-OLwlOKw", "Traversable", "Landroidx/compose/ui/node/TraversableNode;", "getTraversable-OLwlOKw$annotations", "getTraversable-OLwlOKw", "BringIntoView", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "getBringIntoView-OLwlOKw$annotations", "getBringIntoView-OLwlOKw", "Unplaced", "Landroidx/compose/ui/node/UnplacedAwareModifierNode;", "getUnplaced-OLwlOKw$annotations", "getUnplaced-OLwlOKw", "IndirectPointerInput", "Landroidx/compose/ui/input/indirect/IndirectPointerInputModifierNode;", "getIndirectPointerInput-OLwlOKw$annotations", "getIndirectPointerInput-OLwlOKw", "OnPlaced", "getOnPlaced-OLwlOKw$annotations", "getOnPlaced-OLwlOKw", "BeyondBoundsLayout", "Landroidx/compose/ui/layout/BeyondBoundsLayoutProviderModifierNode;", "getBeyondBoundsLayout-OLwlOKw$annotations", "getBeyondBoundsLayout-OLwlOKw", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Nodes {
    public static final int $stable = 0;
    public static final Nodes INSTANCE = new Nodes();

    private Nodes() {
    }

    /* renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m7677getAnyOLwlOKw() {
        return NodeKind.m7666constructorimpl(1);
    }

    @JvmStatic
    /* renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7678getAnyOLwlOKw$annotations() {
    }

    /* renamed from: getApproachMeasure-OLwlOKw, reason: not valid java name */
    public static final int m7679getApproachMeasureOLwlOKw() {
        return NodeKind.m7666constructorimpl(512);
    }

    @JvmStatic
    /* renamed from: getApproachMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7680getApproachMeasureOLwlOKw$annotations() {
    }

    /* renamed from: getBeyondBoundsLayout-OLwlOKw, reason: not valid java name */
    public static final int m7681getBeyondBoundsLayoutOLwlOKw() {
        return NodeKind.m7666constructorimpl(8388608);
    }

    @JvmStatic
    /* renamed from: getBeyondBoundsLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7682getBeyondBoundsLayoutOLwlOKw$annotations() {
    }

    /* renamed from: getBringIntoView-OLwlOKw, reason: not valid java name */
    public static final int m7683getBringIntoViewOLwlOKw() {
        return NodeKind.m7666constructorimpl(524288);
    }

    @JvmStatic
    /* renamed from: getBringIntoView-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7684getBringIntoViewOLwlOKw$annotations() {
    }

    /* renamed from: getCompositionLocalConsumer-OLwlOKw, reason: not valid java name */
    public static final int m7685getCompositionLocalConsumerOLwlOKw() {
        return NodeKind.m7666constructorimpl(32768);
    }

    @JvmStatic
    /* renamed from: getCompositionLocalConsumer-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7686getCompositionLocalConsumerOLwlOKw$annotations() {
    }

    /* renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m7687getDrawOLwlOKw() {
        return NodeKind.m7666constructorimpl(4);
    }

    @JvmStatic
    /* renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7688getDrawOLwlOKw$annotations() {
    }

    /* renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m7689getFocusEventOLwlOKw() {
        return NodeKind.m7666constructorimpl(4096);
    }

    @JvmStatic
    /* renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7690getFocusEventOLwlOKw$annotations() {
    }

    /* renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m7691getFocusPropertiesOLwlOKw() {
        return NodeKind.m7666constructorimpl(2048);
    }

    @JvmStatic
    /* renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7692getFocusPropertiesOLwlOKw$annotations() {
    }

    /* renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m7693getFocusTargetOLwlOKw() {
        return NodeKind.m7666constructorimpl(1024);
    }

    @JvmStatic
    /* renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7694getFocusTargetOLwlOKw$annotations() {
    }

    /* renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m7695getGlobalPositionAwareOLwlOKw() {
        return NodeKind.m7666constructorimpl(256);
    }

    @JvmStatic
    /* renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7696getGlobalPositionAwareOLwlOKw$annotations() {
    }

    /* renamed from: getIndirectPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m7697getIndirectPointerInputOLwlOKw() {
        return NodeKind.m7666constructorimpl(2097152);
    }

    @JvmStatic
    /* renamed from: getIndirectPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7698getIndirectPointerInputOLwlOKw$annotations() {
    }

    /* renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m7699getKeyInputOLwlOKw() {
        return NodeKind.m7666constructorimpl(8192);
    }

    @JvmStatic
    /* renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7700getKeyInputOLwlOKw$annotations() {
    }

    /* renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m7701getLayoutOLwlOKw() {
        return NodeKind.m7666constructorimpl(2);
    }

    @JvmStatic
    /* renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7702getLayoutOLwlOKw$annotations() {
    }

    /* renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m7703getLocalsOLwlOKw() {
        return NodeKind.m7666constructorimpl(32);
    }

    @JvmStatic
    /* renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7704getLocalsOLwlOKw$annotations() {
    }

    /* renamed from: getOnPlaced-OLwlOKw, reason: not valid java name */
    public static final int m7705getOnPlacedOLwlOKw() {
        return NodeKind.m7666constructorimpl(4194304);
    }

    @JvmStatic
    /* renamed from: getOnPlaced-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7706getOnPlacedOLwlOKw$annotations() {
    }

    /* renamed from: getOnRemeasured-OLwlOKw, reason: not valid java name */
    public static final int m7707getOnRemeasuredOLwlOKw() {
        return NodeKind.m7666constructorimpl(128);
    }

    @JvmStatic
    /* renamed from: getOnRemeasured-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7708getOnRemeasuredOLwlOKw$annotations() {
    }

    /* renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m7709getParentDataOLwlOKw() {
        return NodeKind.m7666constructorimpl(64);
    }

    @JvmStatic
    /* renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7710getParentDataOLwlOKw$annotations() {
    }

    /* renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m7711getPointerInputOLwlOKw() {
        return NodeKind.m7666constructorimpl(16);
    }

    @JvmStatic
    /* renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7712getPointerInputOLwlOKw$annotations() {
    }

    /* renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m7713getRotaryInputOLwlOKw() {
        return NodeKind.m7666constructorimpl(16384);
    }

    @JvmStatic
    /* renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7714getRotaryInputOLwlOKw$annotations() {
    }

    /* renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m7715getSemanticsOLwlOKw() {
        return NodeKind.m7666constructorimpl(8);
    }

    @JvmStatic
    /* renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7716getSemanticsOLwlOKw$annotations() {
    }

    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m7717getSoftKeyboardKeyInputOLwlOKw() {
        return NodeKind.m7666constructorimpl(131072);
    }

    @JvmStatic
    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7718getSoftKeyboardKeyInputOLwlOKw$annotations() {
    }

    /* renamed from: getTraversable-OLwlOKw, reason: not valid java name */
    public static final int m7719getTraversableOLwlOKw() {
        return NodeKind.m7666constructorimpl(262144);
    }

    @JvmStatic
    /* renamed from: getTraversable-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7720getTraversableOLwlOKw$annotations() {
    }

    /* renamed from: getUnplaced-OLwlOKw, reason: not valid java name */
    public static final int m7721getUnplacedOLwlOKw() {
        return NodeKind.m7666constructorimpl(1048576);
    }

    @JvmStatic
    /* renamed from: getUnplaced-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7722getUnplacedOLwlOKw$annotations() {
    }
}
