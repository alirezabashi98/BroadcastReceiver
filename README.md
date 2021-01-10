# BroadcastReceiver
تست برود کست اندروید با کاتلین##


برود کست برایه چه وقتیه؟ برای وقتی که یه چیز گوشی تغییر کنه و لازم باشه من خبر دار بشم

مثلا چی؟ مثلا وقتی حالت هواپیما فعال میشه یا وقتی باطری کم میشه یا اینطور چیزای که مال خود اندرویدن

خب چطور ازش استفاده کنیم؟

اول لازمه یه کلاس درست کنیم مثلا کلاسی به اسم myBrodcast میسازم مثل کد زیر

class myBrodcast(){}

خب حالا باید ارث بری کنه  ازBroadcastReceiver به شکل زیر

class myBrodcast() : BroadcastReceiver() {
}

خب حالا یه متد داره  باید اورایدش کنیم به شکل زیر


class myBrodcast() : BroadcastReceiver() {
         override fun onReceive(context: Context?, intent: Intent?) {{
}

خب حالا هر کاری که میخوایم انجام بشه بعد اون اطفاق مثلا گفتیم حواست به حالت هواپیما باشه
"android.intent.action.AIRPLANE_MODE"
حالا حالت هواپیما فعال بشه یا غیر فعال متد onReceive فراخوانی میشه فقط قبلش باید داخل اندروید منی فیست کد های زیر گذاشتنه شده باشه که بهش بگشم حواسش به چی باشه


        <receiver
            android:enabled="true"
            android:exported="true"
            android:name=".myBrodcast">
            <intent-filter>
                <action android:name="android.intent.action.AIRPLANE_MODE"/>
            </intent-filter>
        </receiver>

یا داخل یه اکتیویتی به شکل زیر بهش بگیم حواسش به چی باشه

this.registerReceiver(myBrodcast(this), IntentFilter("android.intent.action.AIRPLANE_MODE"))

خب اینجا هواسش به حالت هواپیماست

نکته : بعضی وقتا باید یه دسترسی های بدیم
