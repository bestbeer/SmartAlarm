/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\bestb_000\\Documents\\GitHub\\SmartAlarm\\src\\com\\angrydoughnuts\\android\\alarmclock\\AlarmClockInterface.aidl
 */
package com.angrydoughnuts.android.alarmclock;
public interface AlarmClockInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.angrydoughnuts.android.alarmclock.AlarmClockInterface
{
private static final java.lang.String DESCRIPTOR = "com.angrydoughnuts.android.alarmclock.AlarmClockInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.angrydoughnuts.android.alarmclock.AlarmClockInterface interface,
 * generating a proxy if needed.
 */
public static com.angrydoughnuts.android.alarmclock.AlarmClockInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.angrydoughnuts.android.alarmclock.AlarmClockInterface))) {
return ((com.angrydoughnuts.android.alarmclock.AlarmClockInterface)iin);
}
return new com.angrydoughnuts.android.alarmclock.AlarmClockInterface.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_createAlarm:
{
data.enforceInterface(DESCRIPTOR);
com.angrydoughnuts.android.alarmclock.AlarmTime _arg0;
if ((0!=data.readInt())) {
_arg0 = com.angrydoughnuts.android.alarmclock.AlarmTime.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.createAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.deleteAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteAllAlarms:
{
data.enforceInterface(DESCRIPTOR);
this.deleteAllAlarms();
reply.writeNoException();
return true;
}
case TRANSACTION_scheduleAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.scheduleAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unscheduleAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.unscheduleAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_acknowledgeAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.acknowledgeAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_snoozeAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.snoozeAlarm(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_snoozeAlarmFor:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.snoozeAlarmFor(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_pendingAlarm:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.angrydoughnuts.android.alarmclock.AlarmTime _result = this.pendingAlarm(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_pendingAlarmTimes:
{
data.enforceInterface(DESCRIPTOR);
com.angrydoughnuts.android.alarmclock.AlarmTime[] _result = this.pendingAlarmTimes();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.angrydoughnuts.android.alarmclock.AlarmClockInterface
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void createAlarm(com.angrydoughnuts.android.alarmclock.AlarmTime time) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((time!=null)) {
_data.writeInt(1);
time.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_deleteAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteAllAlarms() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_deleteAllAlarms, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void scheduleAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_scheduleAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unscheduleAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_unscheduleAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void acknowledgeAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_acknowledgeAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void snoozeAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_snoozeAlarm, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void snoozeAlarmFor(long alarmId, int minutes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
_data.writeInt(minutes);
mRemote.transact(Stub.TRANSACTION_snoozeAlarmFor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.angrydoughnuts.android.alarmclock.AlarmTime pendingAlarm(long alarmId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.angrydoughnuts.android.alarmclock.AlarmTime _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(alarmId);
mRemote.transact(Stub.TRANSACTION_pendingAlarm, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.angrydoughnuts.android.alarmclock.AlarmTime.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.angrydoughnuts.android.alarmclock.AlarmTime[] pendingAlarmTimes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.angrydoughnuts.android.alarmclock.AlarmTime[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pendingAlarmTimes, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(com.angrydoughnuts.android.alarmclock.AlarmTime.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_createAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_deleteAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_deleteAllAlarms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_scheduleAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unscheduleAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_acknowledgeAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_snoozeAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_snoozeAlarmFor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_pendingAlarm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_pendingAlarmTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void createAlarm(com.angrydoughnuts.android.alarmclock.AlarmTime time) throws android.os.RemoteException;
public void deleteAlarm(long alarmId) throws android.os.RemoteException;
public void deleteAllAlarms() throws android.os.RemoteException;
public void scheduleAlarm(long alarmId) throws android.os.RemoteException;
public void unscheduleAlarm(long alarmId) throws android.os.RemoteException;
public void acknowledgeAlarm(long alarmId) throws android.os.RemoteException;
public void snoozeAlarm(long alarmId) throws android.os.RemoteException;
public void snoozeAlarmFor(long alarmId, int minutes) throws android.os.RemoteException;
public com.angrydoughnuts.android.alarmclock.AlarmTime pendingAlarm(long alarmId) throws android.os.RemoteException;
public com.angrydoughnuts.android.alarmclock.AlarmTime[] pendingAlarmTimes() throws android.os.RemoteException;
}
