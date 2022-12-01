// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class RegionInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RegionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RegionInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RegionInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RegionInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010RegionInfo.proto\u001a\u0016ResVersionConfig.proto\"\u009d\u0006\n\nRegionInfo\u0012\u0015\n\rgateserver_ip\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fgateserver_port\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010pay_callback_url\u0018\u0003 \u0001(\t\u0012\u0011\n\tarea_type\u0018\u0007 \u0001(\t\u0012\u0014\n\fresource_url\u0018\b \u0001(\t\u0012\u0010\n\bdata_url\u0018\t \u0001(\t\u0012\u0014\n\ffeedback_url\u0018\n \u0001(\t\u0012\u0014\n\fbulletin_url\u0018\u000b \u0001(\t\u0012\u0018\n\u0010resource_url_bak\u0018\f \u0001(\t\u0012\u0014\n\fdata_url_bak\u0018\r \u0001(\t\u0012\u001b\n\u0013client_data_version\u0018\u000e \u0001(\r\u0012\u0014\n\fhandbook_url\u0018\u0010 \u0001(\t\u0012#\n\u001bclient_silence_data_version\u0018\u0012 \u0001(\r\u0012\u0017\n\u000fclient_data_md5\u0018\u0013 \u0001(\t\u0012\u001f\n\u0017client_silence_data_md5\u0018\u0014 \u0001(\t\u0012-\n\u0012res_version_config\u0018\u0016 \u0001(\u000b2\u0011.ResVersionConfig\u0012\u0012\n\nsecret_key\u0018\u0017 \u0001(\f\u0012\u001e\n\u0016official_community_url\u0018\u0018 \u0001(\t\u0012\u001d\n\u0015client_version_suffix\u0018\u001a \u0001(\t\u0012%\n\u001dclient_silence_version_suffix\u0018\u001b \u0001(\t\u0012\"\n\u001ause_gateserver_domain_name\u0018\u001c \u0001(\b\u0012\u001e\n\u0016gateserver_domain_name\u0018\u001d \u0001(\t\u0012\u0017\n\u000fuser_center_url\u0018\u001e \u0001(\t\u0012\u0018\n\u0010account_bind_url\u0018\u001f \u0001(\t\u0012\u0011\n\tcdkey_url\u0018  \u0001(\t\u0012\u001a\n\u0012privacy_policy_url\u0018! \u0001(\t\u0012\u0019\n\u0011next_resource_url\u0018\" \u0001(\t\u00122\n\u0017next_res_version_config\u0018# \u0001(\u000b2\u0011.ResVersionConfigB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RegionInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ResVersionConfigOuterClass.getDescriptor() });
        internal_static_RegionInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RegionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RegionInfoOuterClass.internal_static_RegionInfo_descriptor, new String[] { "GateserverIp", "GateserverPort", "PayCallbackUrl", "AreaType", "ResourceUrl", "DataUrl", "FeedbackUrl", "BulletinUrl", "ResourceUrlBak", "DataUrlBak", "ClientDataVersion", "HandbookUrl", "ClientSilenceDataVersion", "ClientDataMd5", "ClientSilenceDataMd5", "ResVersionConfig", "SecretKey", "OfficialCommunityUrl", "ClientVersionSuffix", "ClientSilenceVersionSuffix", "UseGateserverDomainName", "GateserverDomainName", "UserCenterUrl", "AccountBindUrl", "CdkeyUrl", "PrivacyPolicyUrl", "NextResourceUrl", "NextResVersionConfig" });
        ResVersionConfigOuterClass.getDescriptor();
    }
    
    public static final class RegionInfo extends GeneratedMessageV3 implements RegionInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GATESERVER_IP_FIELD_NUMBER = 1;
        private volatile Object gateserverIp_;
        public static final int GATESERVER_PORT_FIELD_NUMBER = 2;
        private int gateserverPort_;
        public static final int PAY_CALLBACK_URL_FIELD_NUMBER = 3;
        private volatile Object payCallbackUrl_;
        public static final int AREA_TYPE_FIELD_NUMBER = 7;
        private volatile Object areaType_;
        public static final int RESOURCE_URL_FIELD_NUMBER = 8;
        private volatile Object resourceUrl_;
        public static final int DATA_URL_FIELD_NUMBER = 9;
        private volatile Object dataUrl_;
        public static final int FEEDBACK_URL_FIELD_NUMBER = 10;
        private volatile Object feedbackUrl_;
        public static final int BULLETIN_URL_FIELD_NUMBER = 11;
        private volatile Object bulletinUrl_;
        public static final int RESOURCE_URL_BAK_FIELD_NUMBER = 12;
        private volatile Object resourceUrlBak_;
        public static final int DATA_URL_BAK_FIELD_NUMBER = 13;
        private volatile Object dataUrlBak_;
        public static final int CLIENT_DATA_VERSION_FIELD_NUMBER = 14;
        private int clientDataVersion_;
        public static final int HANDBOOK_URL_FIELD_NUMBER = 16;
        private volatile Object handbookUrl_;
        public static final int CLIENT_SILENCE_DATA_VERSION_FIELD_NUMBER = 18;
        private int clientSilenceDataVersion_;
        public static final int CLIENT_DATA_MD5_FIELD_NUMBER = 19;
        private volatile Object clientDataMd5_;
        public static final int CLIENT_SILENCE_DATA_MD5_FIELD_NUMBER = 20;
        private volatile Object clientSilenceDataMd5_;
        public static final int RES_VERSION_CONFIG_FIELD_NUMBER = 22;
        private ResVersionConfigOuterClass.ResVersionConfig resVersionConfig_;
        public static final int SECRET_KEY_FIELD_NUMBER = 23;
        private ByteString secretKey_;
        public static final int OFFICIAL_COMMUNITY_URL_FIELD_NUMBER = 24;
        private volatile Object officialCommunityUrl_;
        public static final int CLIENT_VERSION_SUFFIX_FIELD_NUMBER = 26;
        private volatile Object clientVersionSuffix_;
        public static final int CLIENT_SILENCE_VERSION_SUFFIX_FIELD_NUMBER = 27;
        private volatile Object clientSilenceVersionSuffix_;
        public static final int USE_GATESERVER_DOMAIN_NAME_FIELD_NUMBER = 28;
        private boolean useGateserverDomainName_;
        public static final int GATESERVER_DOMAIN_NAME_FIELD_NUMBER = 29;
        private volatile Object gateserverDomainName_;
        public static final int USER_CENTER_URL_FIELD_NUMBER = 30;
        private volatile Object userCenterUrl_;
        public static final int ACCOUNT_BIND_URL_FIELD_NUMBER = 31;
        private volatile Object accountBindUrl_;
        public static final int CDKEY_URL_FIELD_NUMBER = 32;
        private volatile Object cdkeyUrl_;
        public static final int PRIVACY_POLICY_URL_FIELD_NUMBER = 33;
        private volatile Object privacyPolicyUrl_;
        public static final int NEXT_RESOURCE_URL_FIELD_NUMBER = 34;
        private volatile Object nextResourceUrl_;
        public static final int NEXT_RES_VERSION_CONFIG_FIELD_NUMBER = 35;
        private ResVersionConfigOuterClass.ResVersionConfig nextResVersionConfig_;
        private byte memoizedIsInitialized;
        private static final RegionInfo DEFAULT_INSTANCE;
        private static final Parser<RegionInfo> PARSER;
        
        private RegionInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RegionInfo() {
            this.memoizedIsInitialized = -1;
            this.gateserverIp_ = "";
            this.payCallbackUrl_ = "";
            this.areaType_ = "";
            this.resourceUrl_ = "";
            this.dataUrl_ = "";
            this.feedbackUrl_ = "";
            this.bulletinUrl_ = "";
            this.resourceUrlBak_ = "";
            this.dataUrlBak_ = "";
            this.handbookUrl_ = "";
            this.clientDataMd5_ = "";
            this.clientSilenceDataMd5_ = "";
            this.secretKey_ = ByteString.EMPTY;
            this.officialCommunityUrl_ = "";
            this.clientVersionSuffix_ = "";
            this.clientSilenceVersionSuffix_ = "";
            this.gateserverDomainName_ = "";
            this.userCenterUrl_ = "";
            this.accountBindUrl_ = "";
            this.cdkeyUrl_ = "";
            this.privacyPolicyUrl_ = "";
            this.nextResourceUrl_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RegionInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RegionInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.gateserverIp_ = s;
                            continue;
                        }
                        case 16: {
                            this.gateserverPort_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.payCallbackUrl_ = s;
                            continue;
                        }
                        case 58: {
                            final String s = input.readStringRequireUtf8();
                            this.areaType_ = s;
                            continue;
                        }
                        case 66: {
                            final String s = input.readStringRequireUtf8();
                            this.resourceUrl_ = s;
                            continue;
                        }
                        case 74: {
                            final String s = input.readStringRequireUtf8();
                            this.dataUrl_ = s;
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.feedbackUrl_ = s;
                            continue;
                        }
                        case 90: {
                            final String s = input.readStringRequireUtf8();
                            this.bulletinUrl_ = s;
                            continue;
                        }
                        case 98: {
                            final String s = input.readStringRequireUtf8();
                            this.resourceUrlBak_ = s;
                            continue;
                        }
                        case 106: {
                            final String s = input.readStringRequireUtf8();
                            this.dataUrlBak_ = s;
                            continue;
                        }
                        case 112: {
                            this.clientDataVersion_ = input.readUInt32();
                            continue;
                        }
                        case 130: {
                            final String s = input.readStringRequireUtf8();
                            this.handbookUrl_ = s;
                            continue;
                        }
                        case 144: {
                            this.clientSilenceDataVersion_ = input.readUInt32();
                            continue;
                        }
                        case 154: {
                            final String s = input.readStringRequireUtf8();
                            this.clientDataMd5_ = s;
                            continue;
                        }
                        case 162: {
                            final String s = input.readStringRequireUtf8();
                            this.clientSilenceDataMd5_ = s;
                            continue;
                        }
                        case 178: {
                            ResVersionConfigOuterClass.ResVersionConfig.Builder subBuilder = null;
                            if (this.resVersionConfig_ != null) {
                                subBuilder = this.resVersionConfig_.toBuilder();
                            }
                            this.resVersionConfig_ = input.readMessage(ResVersionConfigOuterClass.ResVersionConfig.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.resVersionConfig_);
                                this.resVersionConfig_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 186: {
                            this.secretKey_ = input.readBytes();
                            continue;
                        }
                        case 194: {
                            final String s = input.readStringRequireUtf8();
                            this.officialCommunityUrl_ = s;
                            continue;
                        }
                        case 210: {
                            final String s = input.readStringRequireUtf8();
                            this.clientVersionSuffix_ = s;
                            continue;
                        }
                        case 218: {
                            final String s = input.readStringRequireUtf8();
                            this.clientSilenceVersionSuffix_ = s;
                            continue;
                        }
                        case 224: {
                            this.useGateserverDomainName_ = input.readBool();
                            continue;
                        }
                        case 234: {
                            final String s = input.readStringRequireUtf8();
                            this.gateserverDomainName_ = s;
                            continue;
                        }
                        case 242: {
                            final String s = input.readStringRequireUtf8();
                            this.userCenterUrl_ = s;
                            continue;
                        }
                        case 250: {
                            final String s = input.readStringRequireUtf8();
                            this.accountBindUrl_ = s;
                            continue;
                        }
                        case 258: {
                            final String s = input.readStringRequireUtf8();
                            this.cdkeyUrl_ = s;
                            continue;
                        }
                        case 266: {
                            final String s = input.readStringRequireUtf8();
                            this.privacyPolicyUrl_ = s;
                            continue;
                        }
                        case 274: {
                            final String s = input.readStringRequireUtf8();
                            this.nextResourceUrl_ = s;
                            continue;
                        }
                        case 282: {
                            ResVersionConfigOuterClass.ResVersionConfig.Builder subBuilder = null;
                            if (this.nextResVersionConfig_ != null) {
                                subBuilder = this.nextResVersionConfig_.toBuilder();
                            }
                            this.nextResVersionConfig_ = input.readMessage(ResVersionConfigOuterClass.ResVersionConfig.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.nextResVersionConfig_);
                                this.nextResVersionConfig_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return RegionInfoOuterClass.internal_static_RegionInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RegionInfoOuterClass.internal_static_RegionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionInfo.class, Builder.class);
        }
        
        @Override
        public String getGateserverIp() {
            final Object ref = this.gateserverIp_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gateserverIp_ = s);
        }
        
        @Override
        public ByteString getGateserverIpBytes() {
            final Object ref = this.gateserverIp_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gateserverIp_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getGateserverPort() {
            return this.gateserverPort_;
        }
        
        @Override
        public String getPayCallbackUrl() {
            final Object ref = this.payCallbackUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.payCallbackUrl_ = s);
        }
        
        @Override
        public ByteString getPayCallbackUrlBytes() {
            final Object ref = this.payCallbackUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.payCallbackUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAreaType() {
            final Object ref = this.areaType_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.areaType_ = s);
        }
        
        @Override
        public ByteString getAreaTypeBytes() {
            final Object ref = this.areaType_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.areaType_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getResourceUrl() {
            final Object ref = this.resourceUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.resourceUrl_ = s);
        }
        
        @Override
        public ByteString getResourceUrlBytes() {
            final Object ref = this.resourceUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.resourceUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getDataUrl() {
            final Object ref = this.dataUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.dataUrl_ = s);
        }
        
        @Override
        public ByteString getDataUrlBytes() {
            final Object ref = this.dataUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.dataUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getFeedbackUrl() {
            final Object ref = this.feedbackUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.feedbackUrl_ = s);
        }
        
        @Override
        public ByteString getFeedbackUrlBytes() {
            final Object ref = this.feedbackUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.feedbackUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getBulletinUrl() {
            final Object ref = this.bulletinUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.bulletinUrl_ = s);
        }
        
        @Override
        public ByteString getBulletinUrlBytes() {
            final Object ref = this.bulletinUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.bulletinUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getResourceUrlBak() {
            final Object ref = this.resourceUrlBak_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.resourceUrlBak_ = s);
        }
        
        @Override
        public ByteString getResourceUrlBakBytes() {
            final Object ref = this.resourceUrlBak_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.resourceUrlBak_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getDataUrlBak() {
            final Object ref = this.dataUrlBak_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.dataUrlBak_ = s);
        }
        
        @Override
        public ByteString getDataUrlBakBytes() {
            final Object ref = this.dataUrlBak_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.dataUrlBak_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getClientDataVersion() {
            return this.clientDataVersion_;
        }
        
        @Override
        public String getHandbookUrl() {
            final Object ref = this.handbookUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.handbookUrl_ = s);
        }
        
        @Override
        public ByteString getHandbookUrlBytes() {
            final Object ref = this.handbookUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.handbookUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getClientSilenceDataVersion() {
            return this.clientSilenceDataVersion_;
        }
        
        @Override
        public String getClientDataMd5() {
            final Object ref = this.clientDataMd5_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientDataMd5_ = s);
        }
        
        @Override
        public ByteString getClientDataMd5Bytes() {
            final Object ref = this.clientDataMd5_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientDataMd5_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getClientSilenceDataMd5() {
            final Object ref = this.clientSilenceDataMd5_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientSilenceDataMd5_ = s);
        }
        
        @Override
        public ByteString getClientSilenceDataMd5Bytes() {
            final Object ref = this.clientSilenceDataMd5_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientSilenceDataMd5_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasResVersionConfig() {
            return this.resVersionConfig_ != null;
        }
        
        @Override
        public ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig() {
            return (this.resVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.resVersionConfig_;
        }
        
        @Override
        public ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder() {
            return this.getResVersionConfig();
        }
        
        @Override
        public ByteString getSecretKey() {
            return this.secretKey_;
        }
        
        @Override
        public String getOfficialCommunityUrl() {
            final Object ref = this.officialCommunityUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.officialCommunityUrl_ = s);
        }
        
        @Override
        public ByteString getOfficialCommunityUrlBytes() {
            final Object ref = this.officialCommunityUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.officialCommunityUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getClientVersionSuffix() {
            final Object ref = this.clientVersionSuffix_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientVersionSuffix_ = s);
        }
        
        @Override
        public ByteString getClientVersionSuffixBytes() {
            final Object ref = this.clientVersionSuffix_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientVersionSuffix_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getClientSilenceVersionSuffix() {
            final Object ref = this.clientSilenceVersionSuffix_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientSilenceVersionSuffix_ = s);
        }
        
        @Override
        public ByteString getClientSilenceVersionSuffixBytes() {
            final Object ref = this.clientSilenceVersionSuffix_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientSilenceVersionSuffix_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getUseGateserverDomainName() {
            return this.useGateserverDomainName_;
        }
        
        @Override
        public String getGateserverDomainName() {
            final Object ref = this.gateserverDomainName_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gateserverDomainName_ = s);
        }
        
        @Override
        public ByteString getGateserverDomainNameBytes() {
            final Object ref = this.gateserverDomainName_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gateserverDomainName_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getUserCenterUrl() {
            final Object ref = this.userCenterUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.userCenterUrl_ = s);
        }
        
        @Override
        public ByteString getUserCenterUrlBytes() {
            final Object ref = this.userCenterUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.userCenterUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAccountBindUrl() {
            final Object ref = this.accountBindUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.accountBindUrl_ = s);
        }
        
        @Override
        public ByteString getAccountBindUrlBytes() {
            final Object ref = this.accountBindUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.accountBindUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getCdkeyUrl() {
            final Object ref = this.cdkeyUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.cdkeyUrl_ = s);
        }
        
        @Override
        public ByteString getCdkeyUrlBytes() {
            final Object ref = this.cdkeyUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.cdkeyUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getPrivacyPolicyUrl() {
            final Object ref = this.privacyPolicyUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.privacyPolicyUrl_ = s);
        }
        
        @Override
        public ByteString getPrivacyPolicyUrlBytes() {
            final Object ref = this.privacyPolicyUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.privacyPolicyUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getNextResourceUrl() {
            final Object ref = this.nextResourceUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.nextResourceUrl_ = s);
        }
        
        @Override
        public ByteString getNextResourceUrlBytes() {
            final Object ref = this.nextResourceUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.nextResourceUrl_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasNextResVersionConfig() {
            return this.nextResVersionConfig_ != null;
        }
        
        @Override
        public ResVersionConfigOuterClass.ResVersionConfig getNextResVersionConfig() {
            return (this.nextResVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.nextResVersionConfig_;
        }
        
        @Override
        public ResVersionConfigOuterClass.ResVersionConfigOrBuilder getNextResVersionConfigOrBuilder() {
            return this.getNextResVersionConfig();
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
            if (!GeneratedMessageV3.isStringEmpty(this.gateserverIp_)) {
                GeneratedMessageV3.writeString(output, 1, this.gateserverIp_);
            }
            if (this.gateserverPort_ != 0) {
                output.writeUInt32(2, this.gateserverPort_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.payCallbackUrl_)) {
                GeneratedMessageV3.writeString(output, 3, this.payCallbackUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.areaType_)) {
                GeneratedMessageV3.writeString(output, 7, this.areaType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.resourceUrl_)) {
                GeneratedMessageV3.writeString(output, 8, this.resourceUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dataUrl_)) {
                GeneratedMessageV3.writeString(output, 9, this.dataUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.feedbackUrl_)) {
                GeneratedMessageV3.writeString(output, 10, this.feedbackUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.bulletinUrl_)) {
                GeneratedMessageV3.writeString(output, 11, this.bulletinUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.resourceUrlBak_)) {
                GeneratedMessageV3.writeString(output, 12, this.resourceUrlBak_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dataUrlBak_)) {
                GeneratedMessageV3.writeString(output, 13, this.dataUrlBak_);
            }
            if (this.clientDataVersion_ != 0) {
                output.writeUInt32(14, this.clientDataVersion_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.handbookUrl_)) {
                GeneratedMessageV3.writeString(output, 16, this.handbookUrl_);
            }
            if (this.clientSilenceDataVersion_ != 0) {
                output.writeUInt32(18, this.clientSilenceDataVersion_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientDataMd5_)) {
                GeneratedMessageV3.writeString(output, 19, this.clientDataMd5_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSilenceDataMd5_)) {
                GeneratedMessageV3.writeString(output, 20, this.clientSilenceDataMd5_);
            }
            if (this.resVersionConfig_ != null) {
                output.writeMessage(22, this.getResVersionConfig());
            }
            if (!this.secretKey_.isEmpty()) {
                output.writeBytes(23, this.secretKey_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.officialCommunityUrl_)) {
                GeneratedMessageV3.writeString(output, 24, this.officialCommunityUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientVersionSuffix_)) {
                GeneratedMessageV3.writeString(output, 26, this.clientVersionSuffix_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSilenceVersionSuffix_)) {
                GeneratedMessageV3.writeString(output, 27, this.clientSilenceVersionSuffix_);
            }
            if (this.useGateserverDomainName_) {
                output.writeBool(28, this.useGateserverDomainName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gateserverDomainName_)) {
                GeneratedMessageV3.writeString(output, 29, this.gateserverDomainName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.userCenterUrl_)) {
                GeneratedMessageV3.writeString(output, 30, this.userCenterUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountBindUrl_)) {
                GeneratedMessageV3.writeString(output, 31, this.accountBindUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.cdkeyUrl_)) {
                GeneratedMessageV3.writeString(output, 32, this.cdkeyUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.privacyPolicyUrl_)) {
                GeneratedMessageV3.writeString(output, 33, this.privacyPolicyUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nextResourceUrl_)) {
                GeneratedMessageV3.writeString(output, 34, this.nextResourceUrl_);
            }
            if (this.nextResVersionConfig_ != null) {
                output.writeMessage(35, this.getNextResVersionConfig());
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
            if (!GeneratedMessageV3.isStringEmpty(this.gateserverIp_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.gateserverIp_);
            }
            if (this.gateserverPort_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.gateserverPort_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.payCallbackUrl_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.payCallbackUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.areaType_)) {
                size += GeneratedMessageV3.computeStringSize(7, this.areaType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.resourceUrl_)) {
                size += GeneratedMessageV3.computeStringSize(8, this.resourceUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dataUrl_)) {
                size += GeneratedMessageV3.computeStringSize(9, this.dataUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.feedbackUrl_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.feedbackUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.bulletinUrl_)) {
                size += GeneratedMessageV3.computeStringSize(11, this.bulletinUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.resourceUrlBak_)) {
                size += GeneratedMessageV3.computeStringSize(12, this.resourceUrlBak_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dataUrlBak_)) {
                size += GeneratedMessageV3.computeStringSize(13, this.dataUrlBak_);
            }
            if (this.clientDataVersion_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.clientDataVersion_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.handbookUrl_)) {
                size += GeneratedMessageV3.computeStringSize(16, this.handbookUrl_);
            }
            if (this.clientSilenceDataVersion_ != 0) {
                size += CodedOutputStream.computeUInt32Size(18, this.clientSilenceDataVersion_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientDataMd5_)) {
                size += GeneratedMessageV3.computeStringSize(19, this.clientDataMd5_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSilenceDataMd5_)) {
                size += GeneratedMessageV3.computeStringSize(20, this.clientSilenceDataMd5_);
            }
            if (this.resVersionConfig_ != null) {
                size += CodedOutputStream.computeMessageSize(22, this.getResVersionConfig());
            }
            if (!this.secretKey_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(23, this.secretKey_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.officialCommunityUrl_)) {
                size += GeneratedMessageV3.computeStringSize(24, this.officialCommunityUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientVersionSuffix_)) {
                size += GeneratedMessageV3.computeStringSize(26, this.clientVersionSuffix_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientSilenceVersionSuffix_)) {
                size += GeneratedMessageV3.computeStringSize(27, this.clientSilenceVersionSuffix_);
            }
            if (this.useGateserverDomainName_) {
                size += CodedOutputStream.computeBoolSize(28, this.useGateserverDomainName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gateserverDomainName_)) {
                size += GeneratedMessageV3.computeStringSize(29, this.gateserverDomainName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.userCenterUrl_)) {
                size += GeneratedMessageV3.computeStringSize(30, this.userCenterUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountBindUrl_)) {
                size += GeneratedMessageV3.computeStringSize(31, this.accountBindUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.cdkeyUrl_)) {
                size += GeneratedMessageV3.computeStringSize(32, this.cdkeyUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.privacyPolicyUrl_)) {
                size += GeneratedMessageV3.computeStringSize(33, this.privacyPolicyUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nextResourceUrl_)) {
                size += GeneratedMessageV3.computeStringSize(34, this.nextResourceUrl_);
            }
            if (this.nextResVersionConfig_ != null) {
                size += CodedOutputStream.computeMessageSize(35, this.getNextResVersionConfig());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RegionInfo)) {
                return super.equals(obj);
            }
            final RegionInfo other = (RegionInfo)obj;
            return this.getGateserverIp().equals(other.getGateserverIp()) && this.getGateserverPort() == other.getGateserverPort() && this.getPayCallbackUrl().equals(other.getPayCallbackUrl()) && this.getAreaType().equals(other.getAreaType()) && this.getResourceUrl().equals(other.getResourceUrl()) && this.getDataUrl().equals(other.getDataUrl()) && this.getFeedbackUrl().equals(other.getFeedbackUrl()) && this.getBulletinUrl().equals(other.getBulletinUrl()) && this.getResourceUrlBak().equals(other.getResourceUrlBak()) && this.getDataUrlBak().equals(other.getDataUrlBak()) && this.getClientDataVersion() == other.getClientDataVersion() && this.getHandbookUrl().equals(other.getHandbookUrl()) && this.getClientSilenceDataVersion() == other.getClientSilenceDataVersion() && this.getClientDataMd5().equals(other.getClientDataMd5()) && this.getClientSilenceDataMd5().equals(other.getClientSilenceDataMd5()) && this.hasResVersionConfig() == other.hasResVersionConfig() && (!this.hasResVersionConfig() || this.getResVersionConfig().equals(other.getResVersionConfig())) && this.getSecretKey().equals(other.getSecretKey()) && this.getOfficialCommunityUrl().equals(other.getOfficialCommunityUrl()) && this.getClientVersionSuffix().equals(other.getClientVersionSuffix()) && this.getClientSilenceVersionSuffix().equals(other.getClientSilenceVersionSuffix()) && this.getUseGateserverDomainName() == other.getUseGateserverDomainName() && this.getGateserverDomainName().equals(other.getGateserverDomainName()) && this.getUserCenterUrl().equals(other.getUserCenterUrl()) && this.getAccountBindUrl().equals(other.getAccountBindUrl()) && this.getCdkeyUrl().equals(other.getCdkeyUrl()) && this.getPrivacyPolicyUrl().equals(other.getPrivacyPolicyUrl()) && this.getNextResourceUrl().equals(other.getNextResourceUrl()) && this.hasNextResVersionConfig() == other.hasNextResVersionConfig() && (!this.hasNextResVersionConfig() || this.getNextResVersionConfig().equals(other.getNextResVersionConfig())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getGateserverIp().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getGateserverPort();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPayCallbackUrl().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getAreaType().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getResourceUrl().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getDataUrl().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getFeedbackUrl().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getBulletinUrl().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getResourceUrlBak().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getDataUrlBak().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getClientDataVersion();
            hash = 37 * hash + 16;
            hash = 53 * hash + this.getHandbookUrl().hashCode();
            hash = 37 * hash + 18;
            hash = 53 * hash + this.getClientSilenceDataVersion();
            hash = 37 * hash + 19;
            hash = 53 * hash + this.getClientDataMd5().hashCode();
            hash = 37 * hash + 20;
            hash = 53 * hash + this.getClientSilenceDataMd5().hashCode();
            if (this.hasResVersionConfig()) {
                hash = 37 * hash + 22;
                hash = 53 * hash + this.getResVersionConfig().hashCode();
            }
            hash = 37 * hash + 23;
            hash = 53 * hash + this.getSecretKey().hashCode();
            hash = 37 * hash + 24;
            hash = 53 * hash + this.getOfficialCommunityUrl().hashCode();
            hash = 37 * hash + 26;
            hash = 53 * hash + this.getClientVersionSuffix().hashCode();
            hash = 37 * hash + 27;
            hash = 53 * hash + this.getClientSilenceVersionSuffix().hashCode();
            hash = 37 * hash + 28;
            hash = 53 * hash + Internal.hashBoolean(this.getUseGateserverDomainName());
            hash = 37 * hash + 29;
            hash = 53 * hash + this.getGateserverDomainName().hashCode();
            hash = 37 * hash + 30;
            hash = 53 * hash + this.getUserCenterUrl().hashCode();
            hash = 37 * hash + 31;
            hash = 53 * hash + this.getAccountBindUrl().hashCode();
            hash = 37 * hash + 32;
            hash = 53 * hash + this.getCdkeyUrl().hashCode();
            hash = 37 * hash + 33;
            hash = 53 * hash + this.getPrivacyPolicyUrl().hashCode();
            hash = 37 * hash + 34;
            hash = 53 * hash + this.getNextResourceUrl().hashCode();
            if (this.hasNextResVersionConfig()) {
                hash = 37 * hash + 35;
                hash = 53 * hash + this.getNextResVersionConfig().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RegionInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data);
        }
        
        public static RegionInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data);
        }
        
        public static RegionInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data);
        }
        
        public static RegionInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionInfo.PARSER, input);
        }
        
        public static RegionInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionInfo.PARSER, input, extensionRegistry);
        }
        
        public static RegionInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RegionInfo.PARSER, input);
        }
        
        public static RegionInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RegionInfo.PARSER, input, extensionRegistry);
        }
        
        public static RegionInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionInfo.PARSER, input);
        }
        
        public static RegionInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RegionInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RegionInfo prototype) {
            return RegionInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RegionInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RegionInfo getDefaultInstance() {
            return RegionInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RegionInfo> parser() {
            return RegionInfo.PARSER;
        }
        
        @Override
        public Parser<RegionInfo> getParserForType() {
            return RegionInfo.PARSER;
        }
        
        @Override
        public RegionInfo getDefaultInstanceForType() {
            return RegionInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RegionInfo();
            PARSER = new AbstractParser<RegionInfo>() {
                @Override
                public RegionInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RegionInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RegionInfoOrBuilder
        {
            private Object gateserverIp_;
            private int gateserverPort_;
            private Object payCallbackUrl_;
            private Object areaType_;
            private Object resourceUrl_;
            private Object dataUrl_;
            private Object feedbackUrl_;
            private Object bulletinUrl_;
            private Object resourceUrlBak_;
            private Object dataUrlBak_;
            private int clientDataVersion_;
            private Object handbookUrl_;
            private int clientSilenceDataVersion_;
            private Object clientDataMd5_;
            private Object clientSilenceDataMd5_;
            private ResVersionConfigOuterClass.ResVersionConfig resVersionConfig_;
            private SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder> resVersionConfigBuilder_;
            private ByteString secretKey_;
            private Object officialCommunityUrl_;
            private Object clientVersionSuffix_;
            private Object clientSilenceVersionSuffix_;
            private boolean useGateserverDomainName_;
            private Object gateserverDomainName_;
            private Object userCenterUrl_;
            private Object accountBindUrl_;
            private Object cdkeyUrl_;
            private Object privacyPolicyUrl_;
            private Object nextResourceUrl_;
            private ResVersionConfigOuterClass.ResVersionConfig nextResVersionConfig_;
            private SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder> nextResVersionConfigBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RegionInfoOuterClass.internal_static_RegionInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RegionInfoOuterClass.internal_static_RegionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionInfo.class, Builder.class);
            }
            
            private Builder() {
                this.gateserverIp_ = "";
                this.payCallbackUrl_ = "";
                this.areaType_ = "";
                this.resourceUrl_ = "";
                this.dataUrl_ = "";
                this.feedbackUrl_ = "";
                this.bulletinUrl_ = "";
                this.resourceUrlBak_ = "";
                this.dataUrlBak_ = "";
                this.handbookUrl_ = "";
                this.clientDataMd5_ = "";
                this.clientSilenceDataMd5_ = "";
                this.secretKey_ = ByteString.EMPTY;
                this.officialCommunityUrl_ = "";
                this.clientVersionSuffix_ = "";
                this.clientSilenceVersionSuffix_ = "";
                this.gateserverDomainName_ = "";
                this.userCenterUrl_ = "";
                this.accountBindUrl_ = "";
                this.cdkeyUrl_ = "";
                this.privacyPolicyUrl_ = "";
                this.nextResourceUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.gateserverIp_ = "";
                this.payCallbackUrl_ = "";
                this.areaType_ = "";
                this.resourceUrl_ = "";
                this.dataUrl_ = "";
                this.feedbackUrl_ = "";
                this.bulletinUrl_ = "";
                this.resourceUrlBak_ = "";
                this.dataUrlBak_ = "";
                this.handbookUrl_ = "";
                this.clientDataMd5_ = "";
                this.clientSilenceDataMd5_ = "";
                this.secretKey_ = ByteString.EMPTY;
                this.officialCommunityUrl_ = "";
                this.clientVersionSuffix_ = "";
                this.clientSilenceVersionSuffix_ = "";
                this.gateserverDomainName_ = "";
                this.userCenterUrl_ = "";
                this.accountBindUrl_ = "";
                this.cdkeyUrl_ = "";
                this.privacyPolicyUrl_ = "";
                this.nextResourceUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RegionInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gateserverIp_ = "";
                this.gateserverPort_ = 0;
                this.payCallbackUrl_ = "";
                this.areaType_ = "";
                this.resourceUrl_ = "";
                this.dataUrl_ = "";
                this.feedbackUrl_ = "";
                this.bulletinUrl_ = "";
                this.resourceUrlBak_ = "";
                this.dataUrlBak_ = "";
                this.clientDataVersion_ = 0;
                this.handbookUrl_ = "";
                this.clientSilenceDataVersion_ = 0;
                this.clientDataMd5_ = "";
                this.clientSilenceDataMd5_ = "";
                if (this.resVersionConfigBuilder_ == null) {
                    this.resVersionConfig_ = null;
                }
                else {
                    this.resVersionConfig_ = null;
                    this.resVersionConfigBuilder_ = null;
                }
                this.secretKey_ = ByteString.EMPTY;
                this.officialCommunityUrl_ = "";
                this.clientVersionSuffix_ = "";
                this.clientSilenceVersionSuffix_ = "";
                this.useGateserverDomainName_ = false;
                this.gateserverDomainName_ = "";
                this.userCenterUrl_ = "";
                this.accountBindUrl_ = "";
                this.cdkeyUrl_ = "";
                this.privacyPolicyUrl_ = "";
                this.nextResourceUrl_ = "";
                if (this.nextResVersionConfigBuilder_ == null) {
                    this.nextResVersionConfig_ = null;
                }
                else {
                    this.nextResVersionConfig_ = null;
                    this.nextResVersionConfigBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RegionInfoOuterClass.internal_static_RegionInfo_descriptor;
            }
            
            @Override
            public RegionInfo getDefaultInstanceForType() {
                return RegionInfo.getDefaultInstance();
            }
            
            @Override
            public RegionInfo build() {
                final RegionInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RegionInfo buildPartial() {
                final RegionInfo result = new RegionInfo(this);
                result.gateserverIp_ = this.gateserverIp_;
                result.gateserverPort_ = this.gateserverPort_;
                result.payCallbackUrl_ = this.payCallbackUrl_;
                result.areaType_ = this.areaType_;
                result.resourceUrl_ = this.resourceUrl_;
                result.dataUrl_ = this.dataUrl_;
                result.feedbackUrl_ = this.feedbackUrl_;
                result.bulletinUrl_ = this.bulletinUrl_;
                result.resourceUrlBak_ = this.resourceUrlBak_;
                result.dataUrlBak_ = this.dataUrlBak_;
                result.clientDataVersion_ = this.clientDataVersion_;
                result.handbookUrl_ = this.handbookUrl_;
                result.clientSilenceDataVersion_ = this.clientSilenceDataVersion_;
                result.clientDataMd5_ = this.clientDataMd5_;
                result.clientSilenceDataMd5_ = this.clientSilenceDataMd5_;
                if (this.resVersionConfigBuilder_ == null) {
                    result.resVersionConfig_ = this.resVersionConfig_;
                }
                else {
                    result.resVersionConfig_ = this.resVersionConfigBuilder_.build();
                }
                result.secretKey_ = this.secretKey_;
                result.officialCommunityUrl_ = this.officialCommunityUrl_;
                result.clientVersionSuffix_ = this.clientVersionSuffix_;
                result.clientSilenceVersionSuffix_ = this.clientSilenceVersionSuffix_;
                result.useGateserverDomainName_ = this.useGateserverDomainName_;
                result.gateserverDomainName_ = this.gateserverDomainName_;
                result.userCenterUrl_ = this.userCenterUrl_;
                result.accountBindUrl_ = this.accountBindUrl_;
                result.cdkeyUrl_ = this.cdkeyUrl_;
                result.privacyPolicyUrl_ = this.privacyPolicyUrl_;
                result.nextResourceUrl_ = this.nextResourceUrl_;
                if (this.nextResVersionConfigBuilder_ == null) {
                    result.nextResVersionConfig_ = this.nextResVersionConfig_;
                }
                else {
                    result.nextResVersionConfig_ = this.nextResVersionConfigBuilder_.build();
                }
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
                if (other instanceof RegionInfo) {
                    return this.mergeFrom((RegionInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RegionInfo other) {
                if (other == RegionInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.getGateserverIp().isEmpty()) {
                    this.gateserverIp_ = other.gateserverIp_;
                    this.onChanged();
                }
                if (other.getGateserverPort() != 0) {
                    this.setGateserverPort(other.getGateserverPort());
                }
                if (!other.getPayCallbackUrl().isEmpty()) {
                    this.payCallbackUrl_ = other.payCallbackUrl_;
                    this.onChanged();
                }
                if (!other.getAreaType().isEmpty()) {
                    this.areaType_ = other.areaType_;
                    this.onChanged();
                }
                if (!other.getResourceUrl().isEmpty()) {
                    this.resourceUrl_ = other.resourceUrl_;
                    this.onChanged();
                }
                if (!other.getDataUrl().isEmpty()) {
                    this.dataUrl_ = other.dataUrl_;
                    this.onChanged();
                }
                if (!other.getFeedbackUrl().isEmpty()) {
                    this.feedbackUrl_ = other.feedbackUrl_;
                    this.onChanged();
                }
                if (!other.getBulletinUrl().isEmpty()) {
                    this.bulletinUrl_ = other.bulletinUrl_;
                    this.onChanged();
                }
                if (!other.getResourceUrlBak().isEmpty()) {
                    this.resourceUrlBak_ = other.resourceUrlBak_;
                    this.onChanged();
                }
                if (!other.getDataUrlBak().isEmpty()) {
                    this.dataUrlBak_ = other.dataUrlBak_;
                    this.onChanged();
                }
                if (other.getClientDataVersion() != 0) {
                    this.setClientDataVersion(other.getClientDataVersion());
                }
                if (!other.getHandbookUrl().isEmpty()) {
                    this.handbookUrl_ = other.handbookUrl_;
                    this.onChanged();
                }
                if (other.getClientSilenceDataVersion() != 0) {
                    this.setClientSilenceDataVersion(other.getClientSilenceDataVersion());
                }
                if (!other.getClientDataMd5().isEmpty()) {
                    this.clientDataMd5_ = other.clientDataMd5_;
                    this.onChanged();
                }
                if (!other.getClientSilenceDataMd5().isEmpty()) {
                    this.clientSilenceDataMd5_ = other.clientSilenceDataMd5_;
                    this.onChanged();
                }
                if (other.hasResVersionConfig()) {
                    this.mergeResVersionConfig(other.getResVersionConfig());
                }
                if (other.getSecretKey() != ByteString.EMPTY) {
                    this.setSecretKey(other.getSecretKey());
                }
                if (!other.getOfficialCommunityUrl().isEmpty()) {
                    this.officialCommunityUrl_ = other.officialCommunityUrl_;
                    this.onChanged();
                }
                if (!other.getClientVersionSuffix().isEmpty()) {
                    this.clientVersionSuffix_ = other.clientVersionSuffix_;
                    this.onChanged();
                }
                if (!other.getClientSilenceVersionSuffix().isEmpty()) {
                    this.clientSilenceVersionSuffix_ = other.clientSilenceVersionSuffix_;
                    this.onChanged();
                }
                if (other.getUseGateserverDomainName()) {
                    this.setUseGateserverDomainName(other.getUseGateserverDomainName());
                }
                if (!other.getGateserverDomainName().isEmpty()) {
                    this.gateserverDomainName_ = other.gateserverDomainName_;
                    this.onChanged();
                }
                if (!other.getUserCenterUrl().isEmpty()) {
                    this.userCenterUrl_ = other.userCenterUrl_;
                    this.onChanged();
                }
                if (!other.getAccountBindUrl().isEmpty()) {
                    this.accountBindUrl_ = other.accountBindUrl_;
                    this.onChanged();
                }
                if (!other.getCdkeyUrl().isEmpty()) {
                    this.cdkeyUrl_ = other.cdkeyUrl_;
                    this.onChanged();
                }
                if (!other.getPrivacyPolicyUrl().isEmpty()) {
                    this.privacyPolicyUrl_ = other.privacyPolicyUrl_;
                    this.onChanged();
                }
                if (!other.getNextResourceUrl().isEmpty()) {
                    this.nextResourceUrl_ = other.nextResourceUrl_;
                    this.onChanged();
                }
                if (other.hasNextResVersionConfig()) {
                    this.mergeNextResVersionConfig(other.getNextResVersionConfig());
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
                RegionInfo parsedMessage = null;
                try {
                    parsedMessage = RegionInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RegionInfo)e.getUnfinishedMessage();
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
            public String getGateserverIp() {
                final Object ref = this.gateserverIp_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gateserverIp_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGateserverIpBytes() {
                final Object ref = this.gateserverIp_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gateserverIp_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGateserverIp(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gateserverIp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGateserverIp() {
                this.gateserverIp_ = RegionInfo.getDefaultInstance().getGateserverIp();
                this.onChanged();
                return this;
            }
            
            public Builder setGateserverIpBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gateserverIp_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGateserverPort() {
                return this.gateserverPort_;
            }
            
            public Builder setGateserverPort(final int value) {
                this.gateserverPort_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGateserverPort() {
                this.gateserverPort_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPayCallbackUrl() {
                final Object ref = this.payCallbackUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.payCallbackUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPayCallbackUrlBytes() {
                final Object ref = this.payCallbackUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.payCallbackUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPayCallbackUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.payCallbackUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPayCallbackUrl() {
                this.payCallbackUrl_ = RegionInfo.getDefaultInstance().getPayCallbackUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setPayCallbackUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.payCallbackUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAreaType() {
                final Object ref = this.areaType_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.areaType_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAreaTypeBytes() {
                final Object ref = this.areaType_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.areaType_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAreaType(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.areaType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAreaType() {
                this.areaType_ = RegionInfo.getDefaultInstance().getAreaType();
                this.onChanged();
                return this;
            }
            
            public Builder setAreaTypeBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.areaType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getResourceUrl() {
                final Object ref = this.resourceUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.resourceUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getResourceUrlBytes() {
                final Object ref = this.resourceUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.resourceUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setResourceUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.resourceUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResourceUrl() {
                this.resourceUrl_ = RegionInfo.getDefaultInstance().getResourceUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setResourceUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.resourceUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getDataUrl() {
                final Object ref = this.dataUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.dataUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getDataUrlBytes() {
                final Object ref = this.dataUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.dataUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setDataUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dataUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDataUrl() {
                this.dataUrl_ = RegionInfo.getDefaultInstance().getDataUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setDataUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.dataUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getFeedbackUrl() {
                final Object ref = this.feedbackUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.feedbackUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getFeedbackUrlBytes() {
                final Object ref = this.feedbackUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.feedbackUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setFeedbackUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.feedbackUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFeedbackUrl() {
                this.feedbackUrl_ = RegionInfo.getDefaultInstance().getFeedbackUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setFeedbackUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.feedbackUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getBulletinUrl() {
                final Object ref = this.bulletinUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.bulletinUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getBulletinUrlBytes() {
                final Object ref = this.bulletinUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.bulletinUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setBulletinUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bulletinUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBulletinUrl() {
                this.bulletinUrl_ = RegionInfo.getDefaultInstance().getBulletinUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setBulletinUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.bulletinUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getResourceUrlBak() {
                final Object ref = this.resourceUrlBak_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.resourceUrlBak_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getResourceUrlBakBytes() {
                final Object ref = this.resourceUrlBak_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.resourceUrlBak_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setResourceUrlBak(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.resourceUrlBak_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResourceUrlBak() {
                this.resourceUrlBak_ = RegionInfo.getDefaultInstance().getResourceUrlBak();
                this.onChanged();
                return this;
            }
            
            public Builder setResourceUrlBakBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.resourceUrlBak_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getDataUrlBak() {
                final Object ref = this.dataUrlBak_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.dataUrlBak_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getDataUrlBakBytes() {
                final Object ref = this.dataUrlBak_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.dataUrlBak_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setDataUrlBak(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dataUrlBak_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDataUrlBak() {
                this.dataUrlBak_ = RegionInfo.getDefaultInstance().getDataUrlBak();
                this.onChanged();
                return this;
            }
            
            public Builder setDataUrlBakBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.dataUrlBak_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getClientDataVersion() {
                return this.clientDataVersion_;
            }
            
            public Builder setClientDataVersion(final int value) {
                this.clientDataVersion_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientDataVersion() {
                this.clientDataVersion_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getHandbookUrl() {
                final Object ref = this.handbookUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.handbookUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getHandbookUrlBytes() {
                final Object ref = this.handbookUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.handbookUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setHandbookUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.handbookUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHandbookUrl() {
                this.handbookUrl_ = RegionInfo.getDefaultInstance().getHandbookUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setHandbookUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.handbookUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getClientSilenceDataVersion() {
                return this.clientSilenceDataVersion_;
            }
            
            public Builder setClientSilenceDataVersion(final int value) {
                this.clientSilenceDataVersion_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSilenceDataVersion() {
                this.clientSilenceDataVersion_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientDataMd5() {
                final Object ref = this.clientDataMd5_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientDataMd5_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientDataMd5Bytes() {
                final Object ref = this.clientDataMd5_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientDataMd5_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientDataMd5(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientDataMd5_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientDataMd5() {
                this.clientDataMd5_ = RegionInfo.getDefaultInstance().getClientDataMd5();
                this.onChanged();
                return this;
            }
            
            public Builder setClientDataMd5Bytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientDataMd5_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientSilenceDataMd5() {
                final Object ref = this.clientSilenceDataMd5_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientSilenceDataMd5_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientSilenceDataMd5Bytes() {
                final Object ref = this.clientSilenceDataMd5_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientSilenceDataMd5_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientSilenceDataMd5(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientSilenceDataMd5_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSilenceDataMd5() {
                this.clientSilenceDataMd5_ = RegionInfo.getDefaultInstance().getClientSilenceDataMd5();
                this.onChanged();
                return this;
            }
            
            public Builder setClientSilenceDataMd5Bytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientSilenceDataMd5_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasResVersionConfig() {
                return this.resVersionConfigBuilder_ != null || this.resVersionConfig_ != null;
            }
            
            @Override
            public ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig() {
                if (this.resVersionConfigBuilder_ == null) {
                    return (this.resVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.resVersionConfig_;
                }
                return this.resVersionConfigBuilder_.getMessage();
            }
            
            public Builder setResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig value) {
                if (this.resVersionConfigBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.resVersionConfig_ = value;
                    this.onChanged();
                }
                else {
                    this.resVersionConfigBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig.Builder builderForValue) {
                if (this.resVersionConfigBuilder_ == null) {
                    this.resVersionConfig_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.resVersionConfigBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig value) {
                if (this.resVersionConfigBuilder_ == null) {
                    if (this.resVersionConfig_ != null) {
                        this.resVersionConfig_ = ResVersionConfigOuterClass.ResVersionConfig.newBuilder(this.resVersionConfig_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.resVersionConfig_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.resVersionConfigBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearResVersionConfig() {
                if (this.resVersionConfigBuilder_ == null) {
                    this.resVersionConfig_ = null;
                    this.onChanged();
                }
                else {
                    this.resVersionConfig_ = null;
                    this.resVersionConfigBuilder_ = null;
                }
                return this;
            }
            
            public ResVersionConfigOuterClass.ResVersionConfig.Builder getResVersionConfigBuilder() {
                this.onChanged();
                return this.getResVersionConfigFieldBuilder().getBuilder();
            }
            
            @Override
            public ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder() {
                if (this.resVersionConfigBuilder_ != null) {
                    return this.resVersionConfigBuilder_.getMessageOrBuilder();
                }
                return (this.resVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.resVersionConfig_;
            }
            
            private SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder> getResVersionConfigFieldBuilder() {
                if (this.resVersionConfigBuilder_ == null) {
                    this.resVersionConfigBuilder_ = new SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder>(this.getResVersionConfig(), this.getParentForChildren(), this.isClean());
                    this.resVersionConfig_ = null;
                }
                return this.resVersionConfigBuilder_;
            }
            
            @Override
            public ByteString getSecretKey() {
                return this.secretKey_;
            }
            
            public Builder setSecretKey(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.secretKey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSecretKey() {
                this.secretKey_ = RegionInfo.getDefaultInstance().getSecretKey();
                this.onChanged();
                return this;
            }
            
            @Override
            public String getOfficialCommunityUrl() {
                final Object ref = this.officialCommunityUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.officialCommunityUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getOfficialCommunityUrlBytes() {
                final Object ref = this.officialCommunityUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.officialCommunityUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setOfficialCommunityUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.officialCommunityUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOfficialCommunityUrl() {
                this.officialCommunityUrl_ = RegionInfo.getDefaultInstance().getOfficialCommunityUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setOfficialCommunityUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.officialCommunityUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientVersionSuffix() {
                final Object ref = this.clientVersionSuffix_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientVersionSuffix_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientVersionSuffixBytes() {
                final Object ref = this.clientVersionSuffix_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientVersionSuffix_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientVersionSuffix(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientVersionSuffix_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientVersionSuffix() {
                this.clientVersionSuffix_ = RegionInfo.getDefaultInstance().getClientVersionSuffix();
                this.onChanged();
                return this;
            }
            
            public Builder setClientVersionSuffixBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientVersionSuffix_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientSilenceVersionSuffix() {
                final Object ref = this.clientSilenceVersionSuffix_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientSilenceVersionSuffix_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientSilenceVersionSuffixBytes() {
                final Object ref = this.clientSilenceVersionSuffix_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientSilenceVersionSuffix_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientSilenceVersionSuffix(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientSilenceVersionSuffix_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSilenceVersionSuffix() {
                this.clientSilenceVersionSuffix_ = RegionInfo.getDefaultInstance().getClientSilenceVersionSuffix();
                this.onChanged();
                return this;
            }
            
            public Builder setClientSilenceVersionSuffixBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientSilenceVersionSuffix_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUseGateserverDomainName() {
                return this.useGateserverDomainName_;
            }
            
            public Builder setUseGateserverDomainName(final boolean value) {
                this.useGateserverDomainName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUseGateserverDomainName() {
                this.useGateserverDomainName_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGateserverDomainName() {
                final Object ref = this.gateserverDomainName_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gateserverDomainName_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGateserverDomainNameBytes() {
                final Object ref = this.gateserverDomainName_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gateserverDomainName_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGateserverDomainName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gateserverDomainName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGateserverDomainName() {
                this.gateserverDomainName_ = RegionInfo.getDefaultInstance().getGateserverDomainName();
                this.onChanged();
                return this;
            }
            
            public Builder setGateserverDomainNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gateserverDomainName_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getUserCenterUrl() {
                final Object ref = this.userCenterUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.userCenterUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getUserCenterUrlBytes() {
                final Object ref = this.userCenterUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.userCenterUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setUserCenterUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.userCenterUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUserCenterUrl() {
                this.userCenterUrl_ = RegionInfo.getDefaultInstance().getUserCenterUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setUserCenterUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.userCenterUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAccountBindUrl() {
                final Object ref = this.accountBindUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.accountBindUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAccountBindUrlBytes() {
                final Object ref = this.accountBindUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.accountBindUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAccountBindUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.accountBindUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountBindUrl() {
                this.accountBindUrl_ = RegionInfo.getDefaultInstance().getAccountBindUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setAccountBindUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.accountBindUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCdkeyUrl() {
                final Object ref = this.cdkeyUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.cdkeyUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCdkeyUrlBytes() {
                final Object ref = this.cdkeyUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.cdkeyUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCdkeyUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.cdkeyUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCdkeyUrl() {
                this.cdkeyUrl_ = RegionInfo.getDefaultInstance().getCdkeyUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setCdkeyUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.cdkeyUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPrivacyPolicyUrl() {
                final Object ref = this.privacyPolicyUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.privacyPolicyUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPrivacyPolicyUrlBytes() {
                final Object ref = this.privacyPolicyUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.privacyPolicyUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPrivacyPolicyUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.privacyPolicyUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPrivacyPolicyUrl() {
                this.privacyPolicyUrl_ = RegionInfo.getDefaultInstance().getPrivacyPolicyUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setPrivacyPolicyUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.privacyPolicyUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getNextResourceUrl() {
                final Object ref = this.nextResourceUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.nextResourceUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNextResourceUrlBytes() {
                final Object ref = this.nextResourceUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.nextResourceUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setNextResourceUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.nextResourceUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextResourceUrl() {
                this.nextResourceUrl_ = RegionInfo.getDefaultInstance().getNextResourceUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setNextResourceUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.nextResourceUrl_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasNextResVersionConfig() {
                return this.nextResVersionConfigBuilder_ != null || this.nextResVersionConfig_ != null;
            }
            
            @Override
            public ResVersionConfigOuterClass.ResVersionConfig getNextResVersionConfig() {
                if (this.nextResVersionConfigBuilder_ == null) {
                    return (this.nextResVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.nextResVersionConfig_;
                }
                return this.nextResVersionConfigBuilder_.getMessage();
            }
            
            public Builder setNextResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig value) {
                if (this.nextResVersionConfigBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.nextResVersionConfig_ = value;
                    this.onChanged();
                }
                else {
                    this.nextResVersionConfigBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setNextResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig.Builder builderForValue) {
                if (this.nextResVersionConfigBuilder_ == null) {
                    this.nextResVersionConfig_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.nextResVersionConfigBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeNextResVersionConfig(final ResVersionConfigOuterClass.ResVersionConfig value) {
                if (this.nextResVersionConfigBuilder_ == null) {
                    if (this.nextResVersionConfig_ != null) {
                        this.nextResVersionConfig_ = ResVersionConfigOuterClass.ResVersionConfig.newBuilder(this.nextResVersionConfig_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.nextResVersionConfig_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.nextResVersionConfigBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearNextResVersionConfig() {
                if (this.nextResVersionConfigBuilder_ == null) {
                    this.nextResVersionConfig_ = null;
                    this.onChanged();
                }
                else {
                    this.nextResVersionConfig_ = null;
                    this.nextResVersionConfigBuilder_ = null;
                }
                return this;
            }
            
            public ResVersionConfigOuterClass.ResVersionConfig.Builder getNextResVersionConfigBuilder() {
                this.onChanged();
                return this.getNextResVersionConfigFieldBuilder().getBuilder();
            }
            
            @Override
            public ResVersionConfigOuterClass.ResVersionConfigOrBuilder getNextResVersionConfigOrBuilder() {
                if (this.nextResVersionConfigBuilder_ != null) {
                    return this.nextResVersionConfigBuilder_.getMessageOrBuilder();
                }
                return (this.nextResVersionConfig_ == null) ? ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : this.nextResVersionConfig_;
            }
            
            private SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder> getNextResVersionConfigFieldBuilder() {
                if (this.nextResVersionConfigBuilder_ == null) {
                    this.nextResVersionConfigBuilder_ = new SingleFieldBuilderV3<ResVersionConfigOuterClass.ResVersionConfig, ResVersionConfigOuterClass.ResVersionConfig.Builder, ResVersionConfigOuterClass.ResVersionConfigOrBuilder>(this.getNextResVersionConfig(), this.getParentForChildren(), this.isClean());
                    this.nextResVersionConfig_ = null;
                }
                return this.nextResVersionConfigBuilder_;
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
    
    public interface RegionInfoOrBuilder extends MessageOrBuilder
    {
        String getGateserverIp();
        
        ByteString getGateserverIpBytes();
        
        int getGateserverPort();
        
        String getPayCallbackUrl();
        
        ByteString getPayCallbackUrlBytes();
        
        String getAreaType();
        
        ByteString getAreaTypeBytes();
        
        String getResourceUrl();
        
        ByteString getResourceUrlBytes();
        
        String getDataUrl();
        
        ByteString getDataUrlBytes();
        
        String getFeedbackUrl();
        
        ByteString getFeedbackUrlBytes();
        
        String getBulletinUrl();
        
        ByteString getBulletinUrlBytes();
        
        String getResourceUrlBak();
        
        ByteString getResourceUrlBakBytes();
        
        String getDataUrlBak();
        
        ByteString getDataUrlBakBytes();
        
        int getClientDataVersion();
        
        String getHandbookUrl();
        
        ByteString getHandbookUrlBytes();
        
        int getClientSilenceDataVersion();
        
        String getClientDataMd5();
        
        ByteString getClientDataMd5Bytes();
        
        String getClientSilenceDataMd5();
        
        ByteString getClientSilenceDataMd5Bytes();
        
        boolean hasResVersionConfig();
        
        ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig();
        
        ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder();
        
        ByteString getSecretKey();
        
        String getOfficialCommunityUrl();
        
        ByteString getOfficialCommunityUrlBytes();
        
        String getClientVersionSuffix();
        
        ByteString getClientVersionSuffixBytes();
        
        String getClientSilenceVersionSuffix();
        
        ByteString getClientSilenceVersionSuffixBytes();
        
        boolean getUseGateserverDomainName();
        
        String getGateserverDomainName();
        
        ByteString getGateserverDomainNameBytes();
        
        String getUserCenterUrl();
        
        ByteString getUserCenterUrlBytes();
        
        String getAccountBindUrl();
        
        ByteString getAccountBindUrlBytes();
        
        String getCdkeyUrl();
        
        ByteString getCdkeyUrlBytes();
        
        String getPrivacyPolicyUrl();
        
        ByteString getPrivacyPolicyUrlBytes();
        
        String getNextResourceUrl();
        
        ByteString getNextResourceUrlBytes();
        
        boolean hasNextResVersionConfig();
        
        ResVersionConfigOuterClass.ResVersionConfig getNextResVersionConfig();
        
        ResVersionConfigOuterClass.ResVersionConfigOrBuilder getNextResVersionConfigOrBuilder();
    }
}
