# BroadcastReceiver

<div dir="rtl">

## تست برود کست اندروید با کاتلین


</div>
<div dir="rtl">
برود کست برایه چه وقتیه؟ برای وقتی که یه چیز گوشی تغییر کنه و لازم باشه من خبر دار بشم

مثلا چی؟ مثلا وقتی حالت هواپیما فعال میشه یا وقتی باتری کم میشه یا اینطور چیزای که مال خود اندرویدن

خب چطور ازش استفاده کنیم؟

اول لازمه یه کلاس درست کنیم مثلا کلاسی به اسم myBrodcast میسازم مثل کد زیر
<div dir="ltr">

```
class myBrodcast(){

}
```
</div>
خب حالا باید ارث بری کنه  ازBroadcastReceiver به شکل زیر
<div dir="ltr">

```
class myBrodcast() : BroadcastReceiver() {
         
}

```
</div>
خب حالا یه متد داره  باید اورایدش کنیم به شکل زیر

<div dir="ltr">

```
class myBrodcast() : BroadcastReceiver() {
         override fun onReceive(context: Context?, intent: Intent?) {{
         
         
}
```
</div>
خب حالا هر کاری که میخوایم انجام بشه بعد اون اتفاق مثلا گفتیم حواست به حالت هواپیما باشه

<div dir="ltr">

```
"android.intent.action.AIRPLANE_MODE"
```

</div>

حالا حالت هواپیما فعال بشه یا غیر فعال متد onReceive فراخوانی میشه فقط قبلش باید داخل اندروید منی فیست کد های زیر گذاشتنه شده باشه که بهش بگشم حواسش به چی باشه

<div dir="ltr">
         
```
<receiver
            android:enabled="true"
            android:exported="true"
            android:name=".myBrodcast">
            <intent-filter>
                <action android:name="android.intent.action.AIRPLANE_MODE"/>
            </intent-filter>
        </receiver>
```

</div>
یا داخل یه اکتیویتی به شکل زیر بهش بگیم حواسش به چی باشه
<div dir="ltr">

```
this.registerReceiver(myBrodcast(this), IntentFilter("android.intent.action.AIRPLANE_MODE"))
```

</div>
خب اینجا هواسش به حالت هواپیماست

نکته : بعضی وقتا باید یه دسترسی های بدیم

نکته دوم : لازم نیست به برود کست this بدید من اینجا داخل پروژه یه اینترفیست گذاشتم برای همین داخل کانسرکتور برد کست اون اینترفیست میخواد و من this دادم شما به شکل پایین مقدار دهی کنید داخل اکتیویتی راستی فقط یا داخل اکتتیویتی یا منفیست یکیش تعریف کنید تمومه

نکته 3 : برای درک نکته دوم پروژه کلون کنید و داخل مین اکتیویتی نگاه کنیدداخل متد onStart مقدار دهی کردم

داخل یه اکتیویتی به شکل زیر بهش بگیم حواسش به چی باشه
</div>

<div dir="ltr">

```
this.registerReceiver(myBrodcast(), IntentFilter("android.intent.action.AIRPLANE_MODE"))
```

</div>

</div>
