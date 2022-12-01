// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class QueryRegionListHttpRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_QueryRegionListHttpRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QueryRegionListHttpRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QueryRegionListHttpRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QueryRegionListHttpRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cQueryRegionListHttpRsp.proto\u001a\u0016RegionSimpleInfo.proto\"\u00ad\u0001\n\u0016QueryRegionListHttpRsp\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012&\n\u000bregion_list\u0018\u0002 \u0003(\u000b2\u0011.RegionSimpleInfo\u0012\u0019\n\u0011client_secret_key\u0018\u0005 \u0001(\f\u0012&\n\u001eclient_custom_config_encrypted\u0018\u0006 \u0001(\f\u0012\u0017\n\u000fenable_login_pc\u0018\u0007 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QueryRegionListHttpRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { RegionSimpleInfoOuterClass.getDescriptor() });
        internal_static_QueryRegionListHttpRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QueryRegionListHttpRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor, new String[] { "Retcode", "RegionList", "ClientSecretKey", "ClientCustomConfigEncrypted", "EnableLoginPc" });
        RegionSimpleInfoOuterClass.getDescriptor();
    }
    
    public static final class QueryRegionListHttpRsp extends GeneratedMessageV3 implements QueryRegionListHttpRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int REGION_LIST_FIELD_NUMBER = 2;
        private List<RegionSimpleInfoOuterClass.RegionSimpleInfo> regionList_;
        public static final int CLIENT_SECRET_KEY_FIELD_NUMBER = 5;
        private ByteString clientSecretKey_;
        public static final int CLIENT_CUSTOM_CONFIG_ENCRYPTED_FIELD_NUMBER = 6;
        private ByteString clientCustomConfigEncrypted_;
        public static final int ENABLE_LOGIN_PC_FIELD_NUMBER = 7;
        private boolean enableLoginPc_;
        private byte memoizedIsInitialized;
        private static final QueryRegionListHttpRsp DEFAULT_INSTANCE;
        private static final Parser<QueryRegionListHttpRsp> PARSER;
        
        private QueryRegionListHttpRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private QueryRegionListHttpRsp() {
            this.memoizedIsInitialized = -1;
            this.regionList_ = Collections.emptyList();
            this.clientSecretKey_ = ByteString.EMPTY;
            this.clientCustomConfigEncrypted_ = ByteString.EMPTY;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QueryRegionListHttpRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QueryRegionListHttpRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.regionList_ = new ArrayList<RegionSimpleInfoOuterClass.RegionSimpleInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.regionList_.add(input.readMessage(RegionSimpleInfoOuterClass.RegionSimpleInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 42: {
                            this.clientSecretKey_ = input.readBytes();
                            continue;
                        }
                        case 50: {
                            this.clientCustomConfigEncrypted_ = input.readBytes();
                            continue;
                        }
                        case 56: {
                            this.enableLoginPc_ = input.readBool();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.regionList_ = Collections.unmodifiableList((List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfo>)this.regionList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryRegionListHttpRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<RegionSimpleInfoOuterClass.RegionSimpleInfo> getRegionListList() {
            return this.regionList_;
        }
        
        @Override
        public List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> getRegionListOrBuilderList() {
            return this.regionList_;
        }
        
        @Override
        public int getRegionListCount() {
            return this.regionList_.size();
        }
        
        @Override
        public RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(final int index) {
            return this.regionList_.get(index);
        }
        
        @Override
        public RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(final int index) {
            return this.regionList_.get(index);
        }
        
        @Override
        public ByteString getClientSecretKey() {
            return this.clientSecretKey_;
        }
        
        @Override
        public ByteString getClientCustomConfigEncrypted() {
            return this.clientCustomConfigEncrypted_;
        }
        
        @Override
        public boolean getEnableLoginPc() {
            return this.enableLoginPc_;
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
            for (int i = 0; i < this.regionList_.size(); ++i) {
                output.writeMessage(2, this.regionList_.get(i));
            }
            if (!this.clientSecretKey_.isEmpty()) {
                output.writeBytes(5, this.clientSecretKey_);
            }
            if (!this.clientCustomConfigEncrypted_.isEmpty()) {
                output.writeBytes(6, this.clientCustomConfigEncrypted_);
            }
            if (this.enableLoginPc_) {
                output.writeBool(7, this.enableLoginPc_);
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
            for (int i = 0; i < this.regionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.regionList_.get(i));
            }
            if (!this.clientSecretKey_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(5, this.clientSecretKey_);
            }
            if (!this.clientCustomConfigEncrypted_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(6, this.clientCustomConfigEncrypted_);
            }
            if (this.enableLoginPc_) {
                size += CodedOutputStream.computeBoolSize(7, this.enableLoginPc_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryRegionListHttpRsp)) {
                return super.equals(obj);
            }
            final QueryRegionListHttpRsp other = (QueryRegionListHttpRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getRegionListList().equals(other.getRegionListList()) && this.getClientSecretKey().equals(other.getClientSecretKey()) && this.getClientCustomConfigEncrypted().equals(other.getClientCustomConfigEncrypted()) && this.getEnableLoginPc() == other.getEnableLoginPc() && this.unknownFields.equals(other.unknownFields);
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
            if (this.getRegionListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getRegionListList().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getClientSecretKey().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getClientCustomConfigEncrypted().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getEnableLoginPc());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QueryRegionListHttpRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QueryRegionListHttpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryRegionListHttpRsp.PARSER, input);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryRegionListHttpRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryRegionListHttpRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryRegionListHttpRsp.PARSER, input);
        }
        
        public static QueryRegionListHttpRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QueryRegionListHttpRsp.PARSER, input, extensionRegistry);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryRegionListHttpRsp.PARSER, input);
        }
        
        public static QueryRegionListHttpRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QueryRegionListHttpRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QueryRegionListHttpRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QueryRegionListHttpRsp prototype) {
            return QueryRegionListHttpRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QueryRegionListHttpRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QueryRegionListHttpRsp getDefaultInstance() {
            return QueryRegionListHttpRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QueryRegionListHttpRsp> parser() {
            return QueryRegionListHttpRsp.PARSER;
        }
        
        @Override
        public Parser<QueryRegionListHttpRsp> getParserForType() {
            return QueryRegionListHttpRsp.PARSER;
        }
        
        @Override
        public QueryRegionListHttpRsp getDefaultInstanceForType() {
            return QueryRegionListHttpRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QueryRegionListHttpRsp();
            PARSER = new AbstractParser<QueryRegionListHttpRsp>() {
                @Override
                public QueryRegionListHttpRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QueryRegionListHttpRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QueryRegionListHttpRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<RegionSimpleInfoOuterClass.RegionSimpleInfo> regionList_;
            private RepeatedFieldBuilderV3<RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> regionListBuilder_;
            private ByteString clientSecretKey_;
            private ByteString clientCustomConfigEncrypted_;
            private boolean enableLoginPc_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QueryRegionListHttpRsp.class, Builder.class);
            }
            
            private Builder() {
                this.regionList_ = Collections.emptyList();
                this.clientSecretKey_ = ByteString.EMPTY;
                this.clientCustomConfigEncrypted_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.regionList_ = Collections.emptyList();
                this.clientSecretKey_ = ByteString.EMPTY;
                this.clientCustomConfigEncrypted_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QueryRegionListHttpRsp.alwaysUseFieldBuilders) {
                    this.getRegionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.regionListBuilder_ == null) {
                    this.regionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.regionListBuilder_.clear();
                }
                this.clientSecretKey_ = ByteString.EMPTY;
                this.clientCustomConfigEncrypted_ = ByteString.EMPTY;
                this.enableLoginPc_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
            }
            
            @Override
            public QueryRegionListHttpRsp getDefaultInstanceForType() {
                return QueryRegionListHttpRsp.getDefaultInstance();
            }
            
            @Override
            public QueryRegionListHttpRsp build() {
                final QueryRegionListHttpRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QueryRegionListHttpRsp buildPartial() {
                final QueryRegionListHttpRsp result = new QueryRegionListHttpRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.regionListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.regionList_ = Collections.unmodifiableList((List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfo>)this.regionList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.regionList_ = this.regionList_;
                }
                else {
                    result.regionList_ = this.regionListBuilder_.build();
                }
                result.clientSecretKey_ = this.clientSecretKey_;
                result.clientCustomConfigEncrypted_ = this.clientCustomConfigEncrypted_;
                result.enableLoginPc_ = this.enableLoginPc_;
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
                if (other instanceof QueryRegionListHttpRsp) {
                    return this.mergeFrom((QueryRegionListHttpRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QueryRegionListHttpRsp other) {
                if (other == QueryRegionListHttpRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.regionListBuilder_ == null) {
                    if (!other.regionList_.isEmpty()) {
                        if (this.regionList_.isEmpty()) {
                            this.regionList_ = other.regionList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureRegionListIsMutable();
                            this.regionList_.addAll(other.regionList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.regionList_.isEmpty()) {
                    if (this.regionListBuilder_.isEmpty()) {
                        this.regionListBuilder_.dispose();
                        this.regionListBuilder_ = null;
                        this.regionList_ = other.regionList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.regionListBuilder_ = (QueryRegionListHttpRsp.alwaysUseFieldBuilders ? this.getRegionListFieldBuilder() : null);
                    }
                    else {
                        this.regionListBuilder_.addAllMessages(other.regionList_);
                    }
                }
                if (other.getClientSecretKey() != ByteString.EMPTY) {
                    this.setClientSecretKey(other.getClientSecretKey());
                }
                if (other.getClientCustomConfigEncrypted() != ByteString.EMPTY) {
                    this.setClientCustomConfigEncrypted(other.getClientCustomConfigEncrypted());
                }
                if (other.getEnableLoginPc()) {
                    this.setEnableLoginPc(other.getEnableLoginPc());
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
                QueryRegionListHttpRsp parsedMessage = null;
                try {
                    parsedMessage = QueryRegionListHttpRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QueryRegionListHttpRsp)e.getUnfinishedMessage();
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
            
            private void ensureRegionListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.regionList_ = new ArrayList<RegionSimpleInfoOuterClass.RegionSimpleInfo>(this.regionList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<RegionSimpleInfoOuterClass.RegionSimpleInfo> getRegionListList() {
                if (this.regionListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfo>)this.regionList_);
                }
                return this.regionListBuilder_.getMessageList();
            }
            
            @Override
            public int getRegionListCount() {
                if (this.regionListBuilder_ == null) {
                    return this.regionList_.size();
                }
                return this.regionListBuilder_.getCount();
            }
            
            @Override
            public RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(final int index) {
                if (this.regionListBuilder_ == null) {
                    return this.regionList_.get(index);
                }
                return this.regionListBuilder_.getMessage(index);
            }
            
            public Builder setRegionList(final int index, final RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
                if (this.regionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRegionListIsMutable();
                    this.regionList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setRegionList(final int index, final RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
                if (this.regionListBuilder_ == null) {
                    this.ensureRegionListIsMutable();
                    this.regionList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addRegionList(final RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
                if (this.regionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRegionListIsMutable();
                    this.regionList_.add(value);
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addRegionList(final int index, final RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
                if (this.regionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureRegionListIsMutable();
                    this.regionList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addRegionList(final RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
                if (this.regionListBuilder_ == null) {
                    this.ensureRegionListIsMutable();
                    this.regionList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addRegionList(final int index, final RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
                if (this.regionListBuilder_ == null) {
                    this.ensureRegionListIsMutable();
                    this.regionList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllRegionList(final Iterable<? extends RegionSimpleInfoOuterClass.RegionSimpleInfo> values) {
                if (this.regionListBuilder_ == null) {
                    this.ensureRegionListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.regionList_);
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearRegionList() {
                if (this.regionListBuilder_ == null) {
                    this.regionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeRegionList(final int index) {
                if (this.regionListBuilder_ == null) {
                    this.ensureRegionListIsMutable();
                    this.regionList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.regionListBuilder_.remove(index);
                }
                return this;
            }
            
            public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder getRegionListBuilder(final int index) {
                return this.getRegionListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(final int index) {
                if (this.regionListBuilder_ == null) {
                    return this.regionList_.get(index);
                }
                return this.regionListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> getRegionListOrBuilderList() {
                if (this.regionListBuilder_ != null) {
                    return this.regionListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder>)this.regionList_);
            }
            
            public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder addRegionListBuilder() {
                return this.getRegionListFieldBuilder().addBuilder(RegionSimpleInfoOuterClass.RegionSimpleInfo.getDefaultInstance());
            }
            
            public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder addRegionListBuilder(final int index) {
                return this.getRegionListFieldBuilder().addBuilder(index, RegionSimpleInfoOuterClass.RegionSimpleInfo.getDefaultInstance());
            }
            
            public List<RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder> getRegionListBuilderList() {
                return this.getRegionListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> getRegionListFieldBuilder() {
                if (this.regionListBuilder_ == null) {
                    this.regionListBuilder_ = new RepeatedFieldBuilderV3<RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder>(this.regionList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.regionList_ = null;
                }
                return this.regionListBuilder_;
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
                this.clientSecretKey_ = QueryRegionListHttpRsp.getDefaultInstance().getClientSecretKey();
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getClientCustomConfigEncrypted() {
                return this.clientCustomConfigEncrypted_;
            }
            
            public Builder setClientCustomConfigEncrypted(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientCustomConfigEncrypted_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientCustomConfigEncrypted() {
                this.clientCustomConfigEncrypted_ = QueryRegionListHttpRsp.getDefaultInstance().getClientCustomConfigEncrypted();
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getEnableLoginPc() {
                return this.enableLoginPc_;
            }
            
            public Builder setEnableLoginPc(final boolean value) {
                this.enableLoginPc_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnableLoginPc() {
                this.enableLoginPc_ = false;
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
    
    public interface QueryRegionListHttpRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<RegionSimpleInfoOuterClass.RegionSimpleInfo> getRegionListList();
        
        RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(final int p0);
        
        int getRegionListCount();
        
        List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> getRegionListOrBuilderList();
        
        RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(final int p0);
        
        ByteString getClientSecretKey();
        
        ByteString getClientCustomConfigEncrypted();
        
        boolean getEnableLoginPc();
    }
}
