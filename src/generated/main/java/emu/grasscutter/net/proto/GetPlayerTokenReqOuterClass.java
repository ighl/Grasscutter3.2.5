// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetPlayerTokenReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetPlayerTokenReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetPlayerTokenReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetPlayerTokenReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetPlayerTokenReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017GetPlayerTokenReq.proto\"\u00ca\u0002\n\u0011GetPlayerTokenReq\u0012\u0015\n\raccount_token\u0018\b \u0001(\t\u0012\u0013\n\u000baccount_uid\u0018\u0003 \u0001(\t\u0012\u0011\n\tonline_id\u0018\n \u0001(\t\u0012\u0013\n\u000baccount_ext\u0018\t \u0001(\t\u0012\u0014\n\fcountry_code\u0018\u0005 \u0001(\t\u0012\u0014\n\u000bclient_seed\u0018\u0084\r \u0001(\t\u0012\u0010\n\bis_guest\u0018\u0004 \u0001(\b\u0012\u0011\n\bbirthday\u0018\u00f4\u0003 \u0001(\t\u0012\u0015\n\rplatform_type\u0018\r \u0001(\r\u0012\u000e\n\u0006psn_id\u0018\f \u0001(\t\u0012\u0014\n\faccount_type\u0018\u0001 \u0001(\r\u0012\u001c\n\u0013Unk2700_NOJPEHIBDJH\u0018\u00e3\u0007 \u0001(\r\u0012\u0017\n\u000fcloud_client_ip\u0018\u000e \u0001(\r\u0012\u000f\n\u0006key_id\u0018\u0083\n \u0001(\r\u0012\u000b\n\u0003uid\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetPlayerTokenReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetPlayerTokenReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetPlayerTokenReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor, new String[] { "AccountToken", "AccountUid", "OnlineId", "AccountExt", "CountryCode", "ClientSeed", "IsGuest", "Birthday", "PlatformType", "PsnId", "AccountType", "Unk2700NOJPEHIBDJH", "CloudClientIp", "KeyId", "Uid" });
    }
    
    public static final class GetPlayerTokenReq extends GeneratedMessageV3 implements GetPlayerTokenReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ACCOUNT_TOKEN_FIELD_NUMBER = 8;
        private volatile Object accountToken_;
        public static final int ACCOUNT_UID_FIELD_NUMBER = 3;
        private volatile Object accountUid_;
        public static final int ONLINE_ID_FIELD_NUMBER = 10;
        private volatile Object onlineId_;
        public static final int ACCOUNT_EXT_FIELD_NUMBER = 9;
        private volatile Object accountExt_;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 5;
        private volatile Object countryCode_;
        public static final int CLIENT_SEED_FIELD_NUMBER = 1668;
        private volatile Object clientSeed_;
        public static final int IS_GUEST_FIELD_NUMBER = 4;
        private boolean isGuest_;
        public static final int BIRTHDAY_FIELD_NUMBER = 500;
        private volatile Object birthday_;
        public static final int PLATFORM_TYPE_FIELD_NUMBER = 13;
        private int platformType_;
        public static final int PSN_ID_FIELD_NUMBER = 12;
        private volatile Object psnId_;
        public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
        private int accountType_;
        public static final int UNK2700_NOJPEHIBDJH_FIELD_NUMBER = 995;
        private int unk2700NOJPEHIBDJH_;
        public static final int CLOUD_CLIENT_IP_FIELD_NUMBER = 14;
        private int cloudClientIp_;
        public static final int KEY_ID_FIELD_NUMBER = 1283;
        private int keyId_;
        public static final int UID_FIELD_NUMBER = 7;
        private int uid_;
        private byte memoizedIsInitialized;
        private static final GetPlayerTokenReq DEFAULT_INSTANCE;
        private static final Parser<GetPlayerTokenReq> PARSER;
        
        private GetPlayerTokenReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetPlayerTokenReq() {
            this.memoizedIsInitialized = -1;
            this.accountToken_ = "";
            this.accountUid_ = "";
            this.onlineId_ = "";
            this.accountExt_ = "";
            this.countryCode_ = "";
            this.clientSeed_ = "";
            this.birthday_ = "";
            this.psnId_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetPlayerTokenReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetPlayerTokenReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.accountType_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.accountUid_ = s;
                            continue;
                        }
                        case 32: {
                            this.isGuest_ = input.readBool();
                            continue;
                        }
                        case 42: {
                            final String s = input.readStringRequireUtf8();
                            this.countryCode_ = s;
                            continue;
                        }
                        case 56: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            final String s = input.readStringRequireUtf8();
                            this.accountToken_ = s;
                            continue;
                        }
                        case 74: {
                            final String s = input.readStringRequireUtf8();
                            this.accountExt_ = s;
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.onlineId_ = s;
                            continue;
                        }
                        case 98: {
                            final String s = input.readStringRequireUtf8();
                            this.psnId_ = s;
                            continue;
                        }
                        case 104: {
                            this.platformType_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.cloudClientIp_ = input.readUInt32();
                            continue;
                        }
                        case 4002: {
                            final String s = input.readStringRequireUtf8();
                            this.birthday_ = s;
                            continue;
                        }
                        case 7960: {
                            this.unk2700NOJPEHIBDJH_ = input.readUInt32();
                            continue;
                        }
                        case 10264: {
                            this.keyId_ = input.readUInt32();
                            continue;
                        }
                        case 13346: {
                            final String s = input.readStringRequireUtf8();
                            this.clientSeed_ = s;
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerTokenReq.class, Builder.class);
        }
        
        @Override
        public String getAccountToken() {
            final Object ref = this.accountToken_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.accountToken_ = s);
        }
        
        @Override
        public ByteString getAccountTokenBytes() {
            final Object ref = this.accountToken_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.accountToken_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAccountUid() {
            final Object ref = this.accountUid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.accountUid_ = s);
        }
        
        @Override
        public ByteString getAccountUidBytes() {
            final Object ref = this.accountUid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.accountUid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getOnlineId() {
            final Object ref = this.onlineId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.onlineId_ = s);
        }
        
        @Override
        public ByteString getOnlineIdBytes() {
            final Object ref = this.onlineId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.onlineId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAccountExt() {
            final Object ref = this.accountExt_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.accountExt_ = s);
        }
        
        @Override
        public ByteString getAccountExtBytes() {
            final Object ref = this.accountExt_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.accountExt_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getCountryCode() {
            final Object ref = this.countryCode_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.countryCode_ = s);
        }
        
        @Override
        public ByteString getCountryCodeBytes() {
            final Object ref = this.countryCode_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.countryCode_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getClientSeed() {
            final Object ref = this.clientSeed_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientSeed_ = s);
        }
        
        @Override
        public ByteString getClientSeedBytes() {
            final Object ref = this.clientSeed_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientSeed_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getIsGuest() {
            return this.isGuest_;
        }
        
        @Override
        public String getBirthday() {
            final Object ref = this.birthday_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.birthday_ = s);
        }
        
        @Override
        public ByteString getBirthdayBytes() {
            final Object ref = this.birthday_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.birthday_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getPlatformType() {
            return this.platformType_;
        }
        
        @Override
        public String getPsnId() {
            final Object ref = this.psnId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.psnId_ = s);
        }
        
        @Override
        public ByteString getPsnIdBytes() {
            final Object ref = this.psnId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.psnId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getAccountType() {
            return this.accountType_;
        }
        
        @Override
        public int getUnk2700NOJPEHIBDJH() {
            return this.unk2700NOJPEHIBDJH_;
        }
        
        @Override
        public int getCloudClientIp() {
            return this.cloudClientIp_;
        }
        
        @Override
        public int getKeyId() {
            return this.keyId_;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.accountType_ != 0) {
                output.writeUInt32(1, this.accountType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountUid_)) {
                GeneratedMessageV3.writeString(output, 3, this.accountUid_);
            }
            if (this.isGuest_) {
                output.writeBool(4, this.isGuest_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
                GeneratedMessageV3.writeString(output, 5, this.countryCode_);
            }
            if (this.uid_ != 0) {
                output.writeUInt32(7, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountToken_)) {
                GeneratedMessageV3.writeString(output, 8, this.accountToken_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountExt_)) {
                GeneratedMessageV3.writeString(output, 9, this.accountExt_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                GeneratedMessageV3.writeString(output, 10, this.onlineId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                GeneratedMessageV3.writeString(output, 12, this.psnId_);
            }
            if (this.platformType_ != 0) {
                output.writeUInt32(13, this.platformType_);
            }
            if (this.cloudClientIp_ != 0) {
                output.writeUInt32(14, this.cloudClientIp_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.birthday_)) {
                GeneratedMessageV3.writeString(output, 500, this.birthday_);
            }
            if (this.unk2700NOJPEHIBDJH_ != 0) {
                output.writeUInt32(995, this.unk2700NOJPEHIBDJH_);
            }
            if (this.keyId_ != 0) {
                output.writeUInt32(1283, this.keyId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSeed_)) {
                GeneratedMessageV3.writeString(output, 1668, this.clientSeed_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.accountType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.accountType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountUid_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.accountUid_);
            }
            if (this.isGuest_) {
                size += CodedOutputStream.computeBoolSize(4, this.isGuest_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
                size += GeneratedMessageV3.computeStringSize(5, this.countryCode_);
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountToken_)) {
                size += GeneratedMessageV3.computeStringSize(8, this.accountToken_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountExt_)) {
                size += GeneratedMessageV3.computeStringSize(9, this.accountExt_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.onlineId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                size += GeneratedMessageV3.computeStringSize(12, this.psnId_);
            }
            if (this.platformType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.platformType_);
            }
            if (this.cloudClientIp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.cloudClientIp_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.birthday_)) {
                size += GeneratedMessageV3.computeStringSize(500, this.birthday_);
            }
            if (this.unk2700NOJPEHIBDJH_ != 0) {
                size += CodedOutputStream.computeUInt32Size(995, this.unk2700NOJPEHIBDJH_);
            }
            if (this.keyId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1283, this.keyId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSeed_)) {
                size += GeneratedMessageV3.computeStringSize(1668, this.clientSeed_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayerTokenReq)) {
                return super.equals(obj);
            }
            final GetPlayerTokenReq other = (GetPlayerTokenReq)obj;
            return this.getAccountToken().equals(other.getAccountToken()) && this.getAccountUid().equals(other.getAccountUid()) && this.getOnlineId().equals(other.getOnlineId()) && this.getAccountExt().equals(other.getAccountExt()) && this.getCountryCode().equals(other.getCountryCode()) && this.getClientSeed().equals(other.getClientSeed()) && this.getIsGuest() == other.getIsGuest() && this.getBirthday().equals(other.getBirthday()) && this.getPlatformType() == other.getPlatformType() && this.getPsnId().equals(other.getPsnId()) && this.getAccountType() == other.getAccountType() && this.getUnk2700NOJPEHIBDJH() == other.getUnk2700NOJPEHIBDJH() && this.getCloudClientIp() == other.getCloudClientIp() && this.getKeyId() == other.getKeyId() && this.getUid() == other.getUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getAccountToken().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getAccountUid().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getOnlineId().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getAccountExt().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getCountryCode().hashCode();
            hash = 37 * hash + 1668;
            hash = 53 * hash + this.getClientSeed().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsGuest());
            hash = 37 * hash + 500;
            hash = 53 * hash + this.getBirthday().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getPlatformType();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getPsnId().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAccountType();
            hash = 37 * hash + 995;
            hash = 53 * hash + this.getUnk2700NOJPEHIBDJH();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getCloudClientIp();
            hash = 37 * hash + 1283;
            hash = 53 * hash + this.getKeyId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetPlayerTokenReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenReq.PARSER, input);
        }
        
        public static GetPlayerTokenReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenReq.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerTokenReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerTokenReq.PARSER, input);
        }
        
        public static GetPlayerTokenReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerTokenReq.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerTokenReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenReq.PARSER, input);
        }
        
        public static GetPlayerTokenReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetPlayerTokenReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetPlayerTokenReq prototype) {
            return GetPlayerTokenReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetPlayerTokenReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetPlayerTokenReq getDefaultInstance() {
            return GetPlayerTokenReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetPlayerTokenReq> parser() {
            return GetPlayerTokenReq.PARSER;
        }
        
        @Override
        public Parser<GetPlayerTokenReq> getParserForType() {
            return GetPlayerTokenReq.PARSER;
        }
        
        @Override
        public GetPlayerTokenReq getDefaultInstanceForType() {
            return GetPlayerTokenReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetPlayerTokenReq();
            PARSER = new AbstractParser<GetPlayerTokenReq>() {
                @Override
                public GetPlayerTokenReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetPlayerTokenReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetPlayerTokenReqOrBuilder
        {
            private Object accountToken_;
            private Object accountUid_;
            private Object onlineId_;
            private Object accountExt_;
            private Object countryCode_;
            private Object clientSeed_;
            private boolean isGuest_;
            private Object birthday_;
            private int platformType_;
            private Object psnId_;
            private int accountType_;
            private int unk2700NOJPEHIBDJH_;
            private int cloudClientIp_;
            private int keyId_;
            private int uid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerTokenReq.class, Builder.class);
            }
            
            private Builder() {
                this.accountToken_ = "";
                this.accountUid_ = "";
                this.onlineId_ = "";
                this.accountExt_ = "";
                this.countryCode_ = "";
                this.clientSeed_ = "";
                this.birthday_ = "";
                this.psnId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.accountToken_ = "";
                this.accountUid_ = "";
                this.onlineId_ = "";
                this.accountExt_ = "";
                this.countryCode_ = "";
                this.clientSeed_ = "";
                this.birthday_ = "";
                this.psnId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetPlayerTokenReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.accountToken_ = "";
                this.accountUid_ = "";
                this.onlineId_ = "";
                this.accountExt_ = "";
                this.countryCode_ = "";
                this.clientSeed_ = "";
                this.isGuest_ = false;
                this.birthday_ = "";
                this.platformType_ = 0;
                this.psnId_ = "";
                this.accountType_ = 0;
                this.unk2700NOJPEHIBDJH_ = 0;
                this.cloudClientIp_ = 0;
                this.keyId_ = 0;
                this.uid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
            }
            
            @Override
            public GetPlayerTokenReq getDefaultInstanceForType() {
                return GetPlayerTokenReq.getDefaultInstance();
            }
            
            @Override
            public GetPlayerTokenReq build() {
                final GetPlayerTokenReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetPlayerTokenReq buildPartial() {
                final GetPlayerTokenReq result = new GetPlayerTokenReq(this);
                result.accountToken_ = this.accountToken_;
                result.accountUid_ = this.accountUid_;
                result.onlineId_ = this.onlineId_;
                result.accountExt_ = this.accountExt_;
                result.countryCode_ = this.countryCode_;
                result.clientSeed_ = this.clientSeed_;
                result.isGuest_ = this.isGuest_;
                result.birthday_ = this.birthday_;
                result.platformType_ = this.platformType_;
                result.psnId_ = this.psnId_;
                result.accountType_ = this.accountType_;
                result.unk2700NOJPEHIBDJH_ = this.unk2700NOJPEHIBDJH_;
                result.cloudClientIp_ = this.cloudClientIp_;
                result.keyId_ = this.keyId_;
                result.uid_ = this.uid_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof GetPlayerTokenReq) {
                    return this.mergeFrom((GetPlayerTokenReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetPlayerTokenReq other) {
                if (other == GetPlayerTokenReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.getAccountToken().isEmpty()) {
                    this.accountToken_ = other.accountToken_;
                    this.onChanged();
                }
                if (!other.getAccountUid().isEmpty()) {
                    this.accountUid_ = other.accountUid_;
                    this.onChanged();
                }
                if (!other.getOnlineId().isEmpty()) {
                    this.onlineId_ = other.onlineId_;
                    this.onChanged();
                }
                if (!other.getAccountExt().isEmpty()) {
                    this.accountExt_ = other.accountExt_;
                    this.onChanged();
                }
                if (!other.getCountryCode().isEmpty()) {
                    this.countryCode_ = other.countryCode_;
                    this.onChanged();
                }
                if (!other.getClientSeed().isEmpty()) {
                    this.clientSeed_ = other.clientSeed_;
                    this.onChanged();
                }
                if (other.getIsGuest()) {
                    this.setIsGuest(other.getIsGuest());
                }
                if (!other.getBirthday().isEmpty()) {
                    this.birthday_ = other.birthday_;
                    this.onChanged();
                }
                if (other.getPlatformType() != 0) {
                    this.setPlatformType(other.getPlatformType());
                }
                if (!other.getPsnId().isEmpty()) {
                    this.psnId_ = other.psnId_;
                    this.onChanged();
                }
                if (other.getAccountType() != 0) {
                    this.setAccountType(other.getAccountType());
                }
                if (other.getUnk2700NOJPEHIBDJH() != 0) {
                    this.setUnk2700NOJPEHIBDJH(other.getUnk2700NOJPEHIBDJH());
                }
                if (other.getCloudClientIp() != 0) {
                    this.setCloudClientIp(other.getCloudClientIp());
                }
                if (other.getKeyId() != 0) {
                    this.setKeyId(other.getKeyId());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                GetPlayerTokenReq parsedMessage = null;
                try {
                    parsedMessage = GetPlayerTokenReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetPlayerTokenReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public String getAccountToken() {
                final Object ref = this.accountToken_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.accountToken_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAccountTokenBytes() {
                final Object ref = this.accountToken_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.accountToken_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAccountToken(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.accountToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountToken() {
                this.accountToken_ = GetPlayerTokenReq.getDefaultInstance().getAccountToken();
                this.onChanged();
                return this;
            }
            
            public Builder setAccountTokenBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.accountToken_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAccountUid() {
                final Object ref = this.accountUid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.accountUid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAccountUidBytes() {
                final Object ref = this.accountUid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.accountUid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAccountUid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.accountUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountUid() {
                this.accountUid_ = GetPlayerTokenReq.getDefaultInstance().getAccountUid();
                this.onChanged();
                return this;
            }
            
            public Builder setAccountUidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.accountUid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getOnlineId() {
                final Object ref = this.onlineId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.onlineId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getOnlineIdBytes() {
                final Object ref = this.onlineId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.onlineId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setOnlineId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.onlineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOnlineId() {
                this.onlineId_ = GetPlayerTokenReq.getDefaultInstance().getOnlineId();
                this.onChanged();
                return this;
            }
            
            public Builder setOnlineIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.onlineId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAccountExt() {
                final Object ref = this.accountExt_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.accountExt_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAccountExtBytes() {
                final Object ref = this.accountExt_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.accountExt_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAccountExt(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.accountExt_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountExt() {
                this.accountExt_ = GetPlayerTokenReq.getDefaultInstance().getAccountExt();
                this.onChanged();
                return this;
            }
            
            public Builder setAccountExtBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.accountExt_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCountryCode() {
                final Object ref = this.countryCode_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.countryCode_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCountryCodeBytes() {
                final Object ref = this.countryCode_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.countryCode_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCountryCode(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.countryCode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCountryCode() {
                this.countryCode_ = GetPlayerTokenReq.getDefaultInstance().getCountryCode();
                this.onChanged();
                return this;
            }
            
            public Builder setCountryCodeBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.countryCode_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientSeed() {
                final Object ref = this.clientSeed_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientSeed_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientSeedBytes() {
                final Object ref = this.clientSeed_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientSeed_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientSeed(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientSeed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSeed() {
                this.clientSeed_ = GetPlayerTokenReq.getDefaultInstance().getClientSeed();
                this.onChanged();
                return this;
            }
            
            public Builder setClientSeedBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientSeed_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsGuest() {
                return this.isGuest_;
            }
            
            public Builder setIsGuest(final boolean value) {
                this.isGuest_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsGuest() {
                this.isGuest_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getBirthday() {
                final Object ref = this.birthday_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.birthday_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getBirthdayBytes() {
                final Object ref = this.birthday_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.birthday_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setBirthday(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.birthday_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBirthday() {
                this.birthday_ = GetPlayerTokenReq.getDefaultInstance().getBirthday();
                this.onChanged();
                return this;
            }
            
            public Builder setBirthdayBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.birthday_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPlatformType() {
                return this.platformType_;
            }
            
            public Builder setPlatformType(final int value) {
                this.platformType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlatformType() {
                this.platformType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPsnId() {
                final Object ref = this.psnId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.psnId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPsnIdBytes() {
                final Object ref = this.psnId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.psnId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPsnId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.psnId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPsnId() {
                this.psnId_ = GetPlayerTokenReq.getDefaultInstance().getPsnId();
                this.onChanged();
                return this;
            }
            
            public Builder setPsnIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.psnId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAccountType() {
                return this.accountType_;
            }
            
            public Builder setAccountType(final int value) {
                this.accountType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountType() {
                this.accountType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700NOJPEHIBDJH() {
                return this.unk2700NOJPEHIBDJH_;
            }
            
            public Builder setUnk2700NOJPEHIBDJH(final int value) {
                this.unk2700NOJPEHIBDJH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NOJPEHIBDJH() {
                this.unk2700NOJPEHIBDJH_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCloudClientIp() {
                return this.cloudClientIp_;
            }
            
            public Builder setCloudClientIp(final int value) {
                this.cloudClientIp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCloudClientIp() {
                this.cloudClientIp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getKeyId() {
                return this.keyId_;
            }
            
            public Builder setKeyId(final int value) {
                this.keyId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKeyId() {
                this.keyId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GetPlayerTokenReqOrBuilder extends MessageOrBuilder
    {
        String getAccountToken();
        
        ByteString getAccountTokenBytes();
        
        String getAccountUid();
        
        ByteString getAccountUidBytes();
        
        String getOnlineId();
        
        ByteString getOnlineIdBytes();
        
        String getAccountExt();
        
        ByteString getAccountExtBytes();
        
        String getCountryCode();
        
        ByteString getCountryCodeBytes();
        
        String getClientSeed();
        
        ByteString getClientSeedBytes();
        
        boolean getIsGuest();
        
        String getBirthday();
        
        ByteString getBirthdayBytes();
        
        int getPlatformType();
        
        String getPsnId();
        
        ByteString getPsnIdBytes();
        
        int getAccountType();
        
        int getUnk2700NOJPEHIBDJH();
        
        int getCloudClientIp();
        
        int getKeyId();
        
        int getUid();
    }
}
