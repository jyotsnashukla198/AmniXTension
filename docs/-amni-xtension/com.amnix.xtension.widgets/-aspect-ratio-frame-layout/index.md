[AmniXtension](../../index.md) / [com.amnix.xtension.widgets](../index.md) / [AspectRatioFrameLayout](./index.md)

# AspectRatioFrameLayout

`class AspectRatioFrameLayout : FrameLayout` [(source)](https://github.com/AmniX/AmniXTension/tree/master/AmniXtension/src/main/java/com/amnix/xtension/widgets/AspectRatioFrameLayout.kt#L25)

Aspect Ratio Frame Layout, Here to Set the Width Height Based on Aspect Ratio

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AspectRatioFrameLayout(context: Context)`<br>`AspectRatioFrameLayout(context: Context, attrs: AttributeSet)`<br>`AspectRatioFrameLayout(context: Context, attrs: AttributeSet, defStyle: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [xRatio](x-ratio.md) | `var xRatio: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [yRatio](y-ratio.md) | `var yRatio: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| Name | Summary |
|---|---|
| [onMeasure](on-measure.md) | `fun onMeasure(widthMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, heightMeasureSpec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| [childs](../../com.amnix.xtension.extensions/android.view.-view-group/childs.md) | `fun ViewGroup.childs(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<View>`<br>get All the Children's as Iterator |
| [contains](../../com.amnix.xtension.extensions/android.view.-view-group/contains.md) | `fun ViewGroup.contains(child: View): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if ViewGroup have the given View as Its Child |
| [fadeIn](../../com.amnix.xtension.extensions/android.view.-view/fade-in.md) | `fun View.fadeIn(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start The FadeIn Animation on This View |
| [fadeOut](../../com.amnix.xtension.extensions/android.view.-view/fade-out.md) | `fun View.fadeOut(duration: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 400): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Start the FadeOut Animation on This View |
| [getActivity](../../com.amnix.xtension.extensions/android.view.-view/get-activity.md) | `fun View.getActivity(): Activity?`<br>get Activity On Which View is inflated to |
| [hideKeyboard](../../com.amnix.xtension.extensions/android.view.-view/hide-keyboard.md) | `fun View.hideKeyboard(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>hide Keyboard |
| [isGone](../../com.amnix.xtension.extensions/android.view.-view/is-gone.md) | `fun View.isGone(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if View Visiblity == GONE |
| [isInvisible](../../com.amnix.xtension.extensions/android.view.-view/is-invisible.md) | `fun View.isInvisible(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if View is Invisible to User |
| [isVisible](../../com.amnix.xtension.extensions/android.view.-view/is-visible.md) | `fun View.isVisible(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>check if View is Visible to User Or Not |
| [minusAssign](../../com.amnix.xtension.extensions/android.view.-view-group/minus-assign.md) | `operator fun ViewGroup.minusAssign(child: View): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Remove View with the (-) Operator |
| [plusAssign](../../com.amnix.xtension.extensions/android.view.-view-group/plus-assign.md) | `operator fun ViewGroup.plusAssign(child: View): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add View with the (+) Operator |
| [resize](../../com.amnix.xtension.extensions/android.view.-view/resize.md) | `fun View.resize(width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, height: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>resize the View Width Height |
| [screenshot](../../com.amnix.xtension.extensions/android.view.-view/screenshot.md) | `fun View.screenshot(): Bitmap`<br>Create a Screnshot of the view and returns it as a Bitmap |
| [setHeight](../../com.amnix.xtension.extensions/android.view.-view/set-height.md) | `fun View.setHeight(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set height |
| [setOnSingleClickListener](../../com.amnix.xtension.extensions/android.view.-view/set-on-single-click-listener.md) | `fun View.setOnSingleClickListener(tolerance: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 500, onClick: (v: View) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Set On Single Click Listener, It will allow user to click on the button after the specified tolerance. So no multiClick Or FastClick From Now |
| [setPaddingBottom](../../com.amnix.xtension.extensions/android.view.-view/set-padding-bottom.md) | `fun View.setPaddingBottom(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Bottom |
| [setPaddingEnd](../../com.amnix.xtension.extensions/android.view.-view/set-padding-end.md) | `fun View.setPaddingEnd(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From End |
| [setPaddingHorizontal](../../com.amnix.xtension.extensions/android.view.-view/set-padding-horizontal.md) | `fun View.setPaddingHorizontal(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding On Horizontal Edges |
| [setPaddingLeft](../../com.amnix.xtension.extensions/android.view.-view/set-padding-left.md) | `fun View.setPaddingLeft(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Left |
| [setPaddingRight](../../com.amnix.xtension.extensions/android.view.-view/set-padding-right.md) | `fun View.setPaddingRight(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Right |
| [setPaddingStart](../../com.amnix.xtension.extensions/android.view.-view/set-padding-start.md) | `fun View.setPaddingStart(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Start |
| [setPaddingTop](../../com.amnix.xtension.extensions/android.view.-view/set-padding-top.md) | `fun View.setPaddingTop(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Top |
| [setPaddingVertical](../../com.amnix.xtension.extensions/android.view.-view/set-padding-vertical.md) | `fun View.setPaddingVertical(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set View Padding From Vertical Edges |
| [setWidth](../../com.amnix.xtension.extensions/android.view.-view/set-width.md) | `fun View.setWidth(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>set Width |
| [showKeyboard](../../com.amnix.xtension.extensions/android.view.-view/show-keyboard.md) | `fun View.showKeyboard(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>show KeyBoard |
