// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Internal;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
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

public final class QueryCurrRegionHttpRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_QueryCurrRegionHttpRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QueryCurrRegionHttpRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QueryCurrRegionHttpRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QueryCurrRegionHttpRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cQueryCurrRegionHttpRsp.proto\u001a\u0015ForceUpdateInfo.proto\u001a\u0010RegionInfo.proto\u001a\u0014StopServerInfo.proto\"¦\u0002\n\u0016QueryCurrRegionHttpRsp\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003msg\u0018\u0002 \u0001(\t\u0012 \n\u000bregion_info\u0018\u0003 \u0001(\u000b2\u000b.RegionInfo\u0012\u0019\n\u0011client_secret_key\u0018\u000b \u0001(\f\u0012&\n\u001eregion_custom_config_encrypted\u0018\f \u0001(\f\u0012-\n%client_region_custom_config_encrypted\u0018\r \u0001(\f\u0012(\n\fforce_udpate\u0018\u0004 \u0001(\u000b2\u0010.ForceUpdateInfoH\u0000\u0012&\n\u000bstop_server\u0018\u0005 \u0001(\u000b2\u000f.StopServerInfoH\u0000B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QueryCurrRegionHttpRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForceUpdateInfoOuterClass.getDescriptor(), RegionInfoOuterClass.getDescriptor(), StopServerInfoOuterClass.getDescriptor() });
        internal_static_QueryCurrRegionHttpRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QueryCurrRegionHttpRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_descriptor, new String[] { "Retcode", "Msg", "RegionInfo", "ClientSecretKey", "RegionCustomConfigEncrypted", "ClientRegionCustomConfigEncrypted", "ForceUdpate", "StopServer", "Detail" });
        ForceUpdateInfoOuterClass.getDescriptor();
        RegionInfoOuterClass.getDescriptor();
        StopServerInfoOuterClass.getDescriptor();
    }
    
    public static final class QueryCurrRegionHttpRsp extends GeneratedMessageV3 implements QueryCurrRegionHttpRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int MSG_FIELD_NUMBER = 2;
        private volatile Object msg_;
        public static final int REGION_INFO_FIELD_NUMBER = 3;
        private RegionInfoOuterClass.RegionInfo regionInfo_;
        public static final int CLIENT_SECRET_KEY_FIELD_NUMBER = 11;
        private ByteString clientSecretKey_;
        public static final int REGION_CUSTOM_CONFIG_ENCRYPTED_FIELD_NUMBER = 12;
        private ByteString regionCustomConfigEncrypted_;
        public static final int CLIENT_REGION_CUSTOM_CONFIG_ENCRYPTED_FIELD_NUMBER = 13;
        private ByteString clientRegionCustomConfigEncrypted_;
        public static final int FORCE_UDPATE_FIELD_NUMBER = 4;
        public static final int STOP_SERVER_FIELD_NUMBER = 5;
        private byte memoizedIsInitialized;
        private static final QueryCurrRegionHttpRsp DEFAULT_INSTANCE;
        private static final Parser<QueryCurrRegionHttpRsp> PARSER;
        
        private QueryCurrRegionHttpRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private QueryCurrRegionHttpRsp() {
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.msg_ = "";
            this.clientSecretKey_ = ByteString.EMPTY;
            this.regionCustomConfigEncrypted_ = ByteString.EMPTY;
            this.clientRegionCustomConfigEncrypted_ = ByteString.EMPTY;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QueryCurrRegionHttpRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QueryCurrRegionHttpRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.msg_ = s;
                            continue;
                        }
                        case 26: {
                            RegionInfoOuterClass.RegionInfo.Builder subBuilder = null;
                            if (this.regionInfo_ != null) {
                                subBuilder = this.regionInfo_.toBuilder();
                            }
                            this.regionInfo_ = input.readMessage(RegionInfoOuterClass.RegionInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.regionInfo_);
                                this.regionInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 34: {
                            ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder subBuilder2 = null;
                            if (this.detailCase_ == 4) {
                                subBuilder2 = ((ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(ForceUpdateInfoOuterClass.ForceUpdateInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_);
                                this.detail_ = subBuilder2.buildPartial();
                            }
                            this.detailCase_ = 4;
                            continue;
                        }
                        case 42: {
                            StopServerInfoOuterClass.StopServerInfo.Builder subBuilder3 = null;
                            if (this.detailCase_ == 5) {
                                subBuilder3 = ((StopServerInfoOuterClass.StopServerInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(StopServerInfoOuterClass.StopServerInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((StopServerInfoOuterClass.StopServerInfo)this.detail_);
                                this.detail_ = subBuilder3.buildPartial();
                            }
                            this.detailCase_ = 5;
                            continue;
                        }
                        case 90: {
                            this.clientSecretKey_ = input.readBytes();
                            continue;
                        }
                        case 98: {
                            this.regionCustomConfigEncrypted_ = input.readBytes();
                            continue;
                        }
                        case 106: {
                            this.clientRegionCustomConfigEncrypted_ = input.readBytes();
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
            return QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCurrRegionHttpRsp.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public String getMsg() {
            final Object ref = this.msg_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.msg_ = s);
        }
        
        @Override
        public ByteString getMsgBytes() {
            final Object ref = this.msg_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.msg_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasRegionInfo() {
            return this.regionInfo_ != null;
        }
        
        @Override
        public RegionInfoOuterClass.RegionInfo getRegionInfo() {
            return (this.regionInfo_ == null) ? RegionInfoOuterClass.RegionInfo.getDefaultInstance() : this.regionInfo_;
        }
        
        @Override
        public RegionInfoOuterClass.RegionInfoOrBuilder getRegionInfoOrBuilder() {
            return this.getRegionInfo();
        }
        
        @Override
        public ByteString getClientSecretKey() {
            return this.clientSecretKey_;
        }
        
        @Override
        public ByteString getRegionCustomConfigEncrypted() {
            return this.regionCustomConfigEncrypted_;
        }
        
        @Override
        public ByteString getClientRegionCustomConfigEncrypted() {
            return this.clientRegionCustomConfigEncrypted_;
        }
        
        @Override
        public boolean hasForceUdpate() {
            return this.detailCase_ == 4;
        }
        
        @Override
        public ForceUpdateInfoOuterClass.ForceUpdateInfo getForceUdpate() {
            if (this.detailCase_ == 4) {
                return (ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_;
            }
            return ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
        }
        
        @Override
        public ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder getForceUdpateOrBuilder() {
            if (this.detailCase_ == 4) {
                return (ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_;
            }
            return ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasStopServer() {
            return this.detailCase_ == 5;
        }
        
        @Override
        public StopServerInfoOuterClass.StopServerInfo getStopServer() {
            if (this.detailCase_ == 5) {
                return (StopServerInfoOuterClass.StopServerInfo)this.detail_;
            }
            return StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
        }
        
        @Override
        public StopServerInfoOuterClass.StopServerInfoOrBuilder getStopServerOrBuilder() {
            if (this.detailCase_ == 5) {
                return (StopServerInfoOuterClass.StopServerInfo)this.detail_;
            }
            return StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.msg_)) {
                GeneratedMessageV3.writeString(output, 2, this.msg_);
            }
            if (this.regionInfo_ != null) {
                output.writeMessage(3, this.getRegionInfo());
            }
            if (this.detailCase_ == 4) {
                output.writeMessage(4, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 5) {
                output.writeMessage(5, (MessageLite)this.detail_);
            }
            if (!this.clientSecretKey_.isEmpty()) {
                output.writeBytes(11, this.clientSecretKey_);
            }
            if (!this.regionCustomConfigEncrypted_.isEmpty()) {
                output.writeBytes(12, this.regionCustomConfigEncrypted_);
            }
            if (!this.clientRegionCustomConfigEncrypted_.isEmpty()) {
                output.writeBytes(13, this.clientRegionCustomConfigEncrypted_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.msg_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.msg_);
            }
            if (this.regionInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getRegionInfo());
            }
            if (this.detailCase_ == 4) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 5) {
                size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.detail_);
            }
            if (!this.clientSecretKey_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(11, this.clientSecretKey_);
            }
            if (!this.regionCustomConfigEncrypted_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(12, this.regionCustomConfigEncrypted_);
            }
            if (!this.clientRegionCustomConfigEncrypted_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(13, this.clientRegionCustomConfigEncrypted_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryCurrRegionHttpRsp)) {
                return super.equals(obj);
            }
            final QueryCurrRegionHttpRsp other = (QueryCurrRegionHttpRsp)obj;
            if (this.getRetcode() != other.getRetcode()) {
                return false;
            }
            if (!this.getMsg().equals(other.getMsg())) {
                return false;
            }
            if (this.hasRegionInfo() != other.hasRegionInfo()) {
                return false;
            }
            if (this.hasRegionInfo() && !this.getRegionInfo().equals(other.getRegionInfo())) {
                return false;
            }
            if (!this.getClientSecretKey().equals(other.getClientSecretKey())) {
                return false;
            }
            if (!this.getRegionCustomConfigEncrypted().equals(other.getRegionCustomConfigEncrypted())) {
                return false;
            }
            if (!this.getClientRegionCustomConfigEncrypted().equals(other.getClientRegionCustomConfigEncrypted())) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 4: {
                    if (!this.getForceUdpate().equals(other.getForceUdpate())) {
                        return false;
                    }
                    break;
                }
                case 5: {
                    if (!this.getStopServer().equals(other.getStopServer())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getMsg().hashCode();
            if (this.hasRegionInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getRegionInfo().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getClientSecretKey().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getRegionCustomConfigEncrypted().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getClientRegionCustomConfigEncrypted().hashCode();
            switch (this.detailCase_) {
                case 4: {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getForceUdpate().hashCode();
                    break;
                }
                case 5: {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getStopServer().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryCurrRegionHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCurrRegionHttpRsp.PARSER, input);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCurrRegionHttpRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryCurrRegionHttpRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCurrRegionHttpRsp.PARSER, input);
        }
        
        public static QueryCurrRegionHttpRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryCurrRegionHttpRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCurrRegionHttpRsp.PARSER, input);
        }
        
        public static QueryCurrRegionHttpRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryCurrRegionHttpRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QueryCurrRegionHttpRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QueryCurrRegionHttpRsp prototype) {
            return QueryCurrRegionHttpRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QueryCurrRegionHttpRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QueryCurrRegionHttpRsp getDefaultInstance() {
            return QueryCurrRegionHttpRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QueryCurrRegionHttpRsp> parser() {
            return QueryCurrRegionHttpRsp.PARSER;
        }
        
        @Override
        public Parser<QueryCurrRegionHttpRsp> getParserForType() {
            return QueryCurrRegionHttpRsp.PARSER;
        }
        
        @Override
        public QueryCurrRegionHttpRsp getDefaultInstanceForType() {
            return QueryCurrRegionHttpRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QueryCurrRegionHttpRsp();
            PARSER = new AbstractParser<QueryCurrRegionHttpRsp>() {
                @Override
                public QueryCurrRegionHttpRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QueryCurrRegionHttpRsp(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            FORCE_UDPATE(4), 
            STOP_SERVER(5), 
            DETAIL_NOT_SET(0);
            
            private final int value;
            
            private DetailCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DetailCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DetailCase forNumber(final int value) {
                switch (value) {
                    case 4: {
                        return DetailCase.FORCE_UDPATE;
                    }
                    case 5: {
                        return DetailCase.STOP_SERVER;
                    }
                    case 0: {
                        return DetailCase.DETAIL_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ DetailCase[] value() {
                return new DetailCase[] { DetailCase.FORCE_UDPATE, DetailCase.STOP_SERVER, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QueryCurrRegionHttpRspOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private int retcode_;
            private Object msg_;
            private RegionInfoOuterClass.RegionInfo regionInfo_;
            private SingleFieldBuilderV3<RegionInfoOuterClass.RegionInfo, RegionInfoOuterClass.RegionInfo.Builder, RegionInfoOuterClass.RegionInfoOrBuilder> regionInfoBuilder_;
            private ByteString clientSecretKey_;
            private ByteString regionCustomConfigEncrypted_;
            private ByteString clientRegionCustomConfigEncrypted_;
            private SingleFieldBuilderV3<ForceUpdateInfoOuterClass.ForceUpdateInfo, ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder, ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder> forceUdpateBuilder_;
            private SingleFieldBuilderV3<StopServerInfoOuterClass.StopServerInfo, StopServerInfoOuterClass.StopServerInfo.Builder, StopServerInfoOuterClass.StopServerInfoOrBuilder> stopServerBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryCurrRegionHttpRsp.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.msg_ = "";
                this.clientSecretKey_ = ByteString.EMPTY;
                this.regionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.clientRegionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.msg_ = "";
                this.clientSecretKey_ = ByteString.EMPTY;
                this.regionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.clientRegionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QueryCurrRegionHttpRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.msg_ = "";
                if (this.regionInfoBuilder_ == null) {
                    this.regionInfo_ = null;
                }
                else {
                    this.regionInfo_ = null;
                    this.regionInfoBuilder_ = null;
                }
                this.clientSecretKey_ = ByteString.EMPTY;
                this.regionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.clientRegionCustomConfigEncrypted_ = ByteString.EMPTY;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QueryCurrRegionHttpRspOuterClass.internal_static_QueryCurrRegionHttpRsp_descriptor;
            }
            
            @Override
            public QueryCurrRegionHttpRsp getDefaultInstanceForType() {
                return QueryCurrRegionHttpRsp.getDefaultInstance();
            }
            
            @Override
            public QueryCurrRegionHttpRsp build() {
                final QueryCurrRegionHttpRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QueryCurrRegionHttpRsp buildPartial() {
                final QueryCurrRegionHttpRsp result = new QueryCurrRegionHttpRsp(this);
                result.retcode_ = this.retcode_;
                result.msg_ = this.msg_;
                if (this.regionInfoBuilder_ == null) {
                    result.regionInfo_ = this.regionInfo_;
                }
                else {
                    result.regionInfo_ = this.regionInfoBuilder_.build();
                }
                result.clientSecretKey_ = this.clientSecretKey_;
                result.regionCustomConfigEncrypted_ = this.regionCustomConfigEncrypted_;
                result.clientRegionCustomConfigEncrypted_ = this.clientRegionCustomConfigEncrypted_;
                if (this.detailCase_ == 4) {
                    if (this.forceUdpateBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.forceUdpateBuilder_.build();
                    }
                }
                if (this.detailCase_ == 5) {
                    if (this.stopServerBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.stopServerBuilder_.build();
                    }
                }
                result.detailCase_ = this.detailCase_;
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
                if (other instanceof QueryCurrRegionHttpRsp) {
                    return this.mergeFrom((QueryCurrRegionHttpRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QueryCurrRegionHttpRsp other) {
                if (other == QueryCurrRegionHttpRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.getMsg().isEmpty()) {
                    this.msg_ = other.msg_;
                    this.onChanged();
                }
                if (other.hasRegionInfo()) {
                    this.mergeRegionInfo(other.getRegionInfo());
                }
                if (other.getClientSecretKey() != ByteString.EMPTY) {
                    this.setClientSecretKey(other.getClientSecretKey());
                }
                if (other.getRegionCustomConfigEncrypted() != ByteString.EMPTY) {
                    this.setRegionCustomConfigEncrypted(other.getRegionCustomConfigEncrypted());
                }
                if (other.getClientRegionCustomConfigEncrypted() != ByteString.EMPTY) {
                    this.setClientRegionCustomConfigEncrypted(other.getClientRegionCustomConfigEncrypted());
                }
                switch (other.getDetailCase()) {
                    case FORCE_UDPATE: {
                        this.mergeForceUdpate(other.getForceUdpate());
                        break;
                    }
                    case STOP_SERVER: {
                        this.mergeStopServer(other.getStopServer());
                        break;
                    }
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
                QueryCurrRegionHttpRsp parsedMessage = null;
                try {
                    parsedMessage = QueryCurrRegionHttpRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QueryCurrRegionHttpRsp)e.getUnfinishedMessage();
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
            public DetailCase getDetailCase() {
                return DetailCase.forNumber(this.detailCase_);
            }
            
            public Builder clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getMsg() {
                final Object ref = this.msg_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.msg_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getMsgBytes() {
                final Object ref = this.msg_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.msg_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setMsg(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.msg_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMsg() {
                this.msg_ = QueryCurrRegionHttpRsp.getDefaultInstance().getMsg();
                this.onChanged();
                return this;
            }
            
            public Builder setMsgBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.msg_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasRegionInfo() {
                return this.regionInfoBuilder_ != null || this.regionInfo_ != null;
            }
            
            @Override
            public RegionInfoOuterClass.RegionInfo getRegionInfo() {
                if (this.regionInfoBuilder_ == null) {
                    return (this.regionInfo_ == null) ? RegionInfoOuterClass.RegionInfo.getDefaultInstance() : this.regionInfo_;
                }
                return this.regionInfoBuilder_.getMessage();
            }
            
            public Builder setRegionInfo(final RegionInfoOuterClass.RegionInfo value) {
                if (this.regionInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.regionInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.regionInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRegionInfo(final RegionInfoOuterClass.RegionInfo.Builder builderForValue) {
                if (this.regionInfoBuilder_ == null) {
                    this.regionInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.regionInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRegionInfo(final RegionInfoOuterClass.RegionInfo value) {
                if (this.regionInfoBuilder_ == null) {
                    if (this.regionInfo_ != null) {
                        this.regionInfo_ = RegionInfoOuterClass.RegionInfo.newBuilder(this.regionInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.regionInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.regionInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRegionInfo() {
                if (this.regionInfoBuilder_ == null) {
                    this.regionInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.regionInfo_ = null;
                    this.regionInfoBuilder_ = null;
                }
                return this;
            }
            
            public RegionInfoOuterClass.RegionInfo.Builder getRegionInfoBuilder() {
                this.onChanged();
                return this.getRegionInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public RegionInfoOuterClass.RegionInfoOrBuilder getRegionInfoOrBuilder() {
                if (this.regionInfoBuilder_ != null) {
                    return this.regionInfoBuilder_.getMessageOrBuilder();
                }
                return (this.regionInfo_ == null) ? RegionInfoOuterClass.RegionInfo.getDefaultInstance() : this.regionInfo_;
            }
            
            private SingleFieldBuilderV3<RegionInfoOuterClass.RegionInfo, RegionInfoOuterClass.RegionInfo.Builder, RegionInfoOuterClass.RegionInfoOrBuilder> getRegionInfoFieldBuilder() {
                if (this.regionInfoBuilder_ == null) {
                    this.regionInfoBuilder_ = new SingleFieldBuilderV3<RegionInfoOuterClass.RegionInfo, RegionInfoOuterClass.RegionInfo.Builder, RegionInfoOuterClass.RegionInfoOrBuilder>(this.getRegionInfo(), this.getParentForChildren(), this.isClean());
                    this.regionInfo_ = null;
                }
                return this.regionInfoBuilder_;
            }
            
            @Override
            public ByteString getClientSecretKey() {
                return this.clientSecretKey_;
            }
            
            public Builder setClientSecretKey(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientSecretKey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSecretKey() {
                this.clientSecretKey_ = QueryCurrRegionHttpRsp.getDefaultInstance().getClientSecretKey();
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getRegionCustomConfigEncrypted() {
                return this.regionCustomConfigEncrypted_;
            }
            
            public Builder setRegionCustomConfigEncrypted(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.regionCustomConfigEncrypted_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRegionCustomConfigEncrypted() {
                this.regionCustomConfigEncrypted_ = QueryCurrRegionHttpRsp.getDefaultInstance().getRegionCustomConfigEncrypted();
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getClientRegionCustomConfigEncrypted() {
                return this.clientRegionCustomConfigEncrypted_;
            }
            
            public Builder setClientRegionCustomConfigEncrypted(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientRegionCustomConfigEncrypted_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientRegionCustomConfigEncrypted() {
                this.clientRegionCustomConfigEncrypted_ = QueryCurrRegionHttpRsp.getDefaultInstance().getClientRegionCustomConfigEncrypted();
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasForceUdpate() {
                return this.detailCase_ == 4;
            }
            
            @Override
            public ForceUpdateInfoOuterClass.ForceUpdateInfo getForceUdpate() {
                if (this.forceUdpateBuilder_ == null) {
                    if (this.detailCase_ == 4) {
                        return (ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_;
                    }
                    return ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 4) {
                        return this.forceUdpateBuilder_.getMessage();
                    }
                    return ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
                }
            }
            
            public Builder setForceUdpate(final ForceUpdateInfoOuterClass.ForceUpdateInfo value) {
                if (this.forceUdpateBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.forceUdpateBuilder_.setMessage(value);
                }
                this.detailCase_ = 4;
                return this;
            }
            
            public Builder setForceUdpate(final ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder builderForValue) {
                if (this.forceUdpateBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.forceUdpateBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 4;
                return this;
            }
            
            public Builder mergeForceUdpate(final ForceUpdateInfoOuterClass.ForceUpdateInfo value) {
                if (this.forceUdpateBuilder_ == null) {
                    if (this.detailCase_ == 4 && this.detail_ != ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance()) {
                        this.detail_ = ForceUpdateInfoOuterClass.ForceUpdateInfo.newBuilder((ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 4) {
                        this.forceUdpateBuilder_.mergeFrom(value);
                    }
                    this.forceUdpateBuilder_.setMessage(value);
                }
                this.detailCase_ = 4;
                return this;
            }
            
            public Builder clearForceUdpate() {
                if (this.forceUdpateBuilder_ == null) {
                    if (this.detailCase_ == 4) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 4) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.forceUdpateBuilder_.clear();
                }
                return this;
            }
            
            public ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder getForceUdpateBuilder() {
                return this.getForceUdpateFieldBuilder().getBuilder();
            }
            
            @Override
            public ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder getForceUdpateOrBuilder() {
                if (this.detailCase_ == 4 && this.forceUdpateBuilder_ != null) {
                    return this.forceUdpateBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 4) {
                    return (ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_;
                }
                return ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ForceUpdateInfoOuterClass.ForceUpdateInfo, ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder, ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder> getForceUdpateFieldBuilder() {
                if (this.forceUdpateBuilder_ == null) {
                    if (this.detailCase_ != 4) {
                        this.detail_ = ForceUpdateInfoOuterClass.ForceUpdateInfo.getDefaultInstance();
                    }
                    this.forceUdpateBuilder_ = new SingleFieldBuilderV3<ForceUpdateInfoOuterClass.ForceUpdateInfo, ForceUpdateInfoOuterClass.ForceUpdateInfo.Builder, ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder>((ForceUpdateInfoOuterClass.ForceUpdateInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 4;
                this.onChanged();
                return this.forceUdpateBuilder_;
            }
            
            @Override
            public boolean hasStopServer() {
                return this.detailCase_ == 5;
            }
            
            @Override
            public StopServerInfoOuterClass.StopServerInfo getStopServer() {
                if (this.stopServerBuilder_ == null) {
                    if (this.detailCase_ == 5) {
                        return (StopServerInfoOuterClass.StopServerInfo)this.detail_;
                    }
                    return StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 5) {
                        return this.stopServerBuilder_.getMessage();
                    }
                    return StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
                }
            }
            
            public Builder setStopServer(final StopServerInfoOuterClass.StopServerInfo value) {
                if (this.stopServerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.stopServerBuilder_.setMessage(value);
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder setStopServer(final StopServerInfoOuterClass.StopServerInfo.Builder builderForValue) {
                if (this.stopServerBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.stopServerBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder mergeStopServer(final StopServerInfoOuterClass.StopServerInfo value) {
                if (this.stopServerBuilder_ == null) {
                    if (this.detailCase_ == 5 && this.detail_ != StopServerInfoOuterClass.StopServerInfo.getDefaultInstance()) {
                        this.detail_ = StopServerInfoOuterClass.StopServerInfo.newBuilder((StopServerInfoOuterClass.StopServerInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 5) {
                        this.stopServerBuilder_.mergeFrom(value);
                    }
                    this.stopServerBuilder_.setMessage(value);
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder clearStopServer() {
                if (this.stopServerBuilder_ == null) {
                    if (this.detailCase_ == 5) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 5) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.stopServerBuilder_.clear();
                }
                return this;
            }
            
            public StopServerInfoOuterClass.StopServerInfo.Builder getStopServerBuilder() {
                return this.getStopServerFieldBuilder().getBuilder();
            }
            
            @Override
            public StopServerInfoOuterClass.StopServerInfoOrBuilder getStopServerOrBuilder() {
                if (this.detailCase_ == 5 && this.stopServerBuilder_ != null) {
                    return this.stopServerBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 5) {
                    return (StopServerInfoOuterClass.StopServerInfo)this.detail_;
                }
                return StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<StopServerInfoOuterClass.StopServerInfo, StopServerInfoOuterClass.StopServerInfo.Builder, StopServerInfoOuterClass.StopServerInfoOrBuilder> getStopServerFieldBuilder() {
                if (this.stopServerBuilder_ == null) {
                    if (this.detailCase_ != 5) {
                        this.detail_ = StopServerInfoOuterClass.StopServerInfo.getDefaultInstance();
                    }
                    this.stopServerBuilder_ = new SingleFieldBuilderV3<StopServerInfoOuterClass.StopServerInfo, StopServerInfoOuterClass.StopServerInfo.Builder, StopServerInfoOuterClass.StopServerInfoOrBuilder>((StopServerInfoOuterClass.StopServerInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 5;
                this.onChanged();
                return this.stopServerBuilder_;
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
    
    public interface QueryCurrRegionHttpRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        String getMsg();
        
        ByteString getMsgBytes();
        
        boolean hasRegionInfo();
        
        RegionInfoOuterClass.RegionInfo getRegionInfo();
        
        RegionInfoOuterClass.RegionInfoOrBuilder getRegionInfoOrBuilder();
        
        ByteString getClientSecretKey();
        
        ByteString getRegionCustomConfigEncrypted();
        
        ByteString getClientRegionCustomConfigEncrypted();
        
        boolean hasForceUdpate();
        
        ForceUpdateInfoOuterClass.ForceUpdateInfo getForceUdpate();
        
        ForceUpdateInfoOuterClass.ForceUpdateInfoOrBuilder getForceUdpateOrBuilder();
        
        boolean hasStopServer();
        
        StopServerInfoOuterClass.StopServerInfo getStopServer();
        
        StopServerInfoOuterClass.StopServerInfoOrBuilder getStopServerOrBuilder();
        
        QueryCurrRegionHttpRsp.DetailCase getDetailCase();
    }
}
