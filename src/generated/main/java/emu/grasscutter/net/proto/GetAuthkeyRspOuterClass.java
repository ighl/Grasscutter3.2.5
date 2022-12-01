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

public final class GetAuthkeyRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetAuthkeyRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetAuthkeyRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetAuthkeyRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetAuthkeyRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013GetAuthkeyRsp.proto\"\u007f\n\rGetAuthkeyRsp\u0012\u0012\n\nauth_appid\u0018\u0004 \u0001(\t\u0012\u0011\n\tsign_type\u0018\u000f \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0006 \u0001(\u0005\u0012\u0013\n\u000bauthkey_ver\u0018\t \u0001(\r\u0012\u0010\n\bgame_biz\u0018\u000b \u0001(\t\u0012\u000f\n\u0007authkey\u0018\u0003 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetAuthkeyRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetAuthkeyRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetAuthkeyRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor, new String[] { "AuthAppid", "SignType", "Retcode", "AuthkeyVer", "GameBiz", "Authkey" });
    }
    
    public static final class GetAuthkeyRsp extends GeneratedMessageV3 implements GetAuthkeyRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AUTH_APPID_FIELD_NUMBER = 4;
        private volatile Object authAppid_;
        public static final int SIGN_TYPE_FIELD_NUMBER = 15;
        private int signType_;
        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        public static final int AUTHKEY_VER_FIELD_NUMBER = 9;
        private int authkeyVer_;
        public static final int GAME_BIZ_FIELD_NUMBER = 11;
        private volatile Object gameBiz_;
        public static final int AUTHKEY_FIELD_NUMBER = 3;
        private volatile Object authkey_;
        private byte memoizedIsInitialized;
        private static final GetAuthkeyRsp DEFAULT_INSTANCE;
        private static final Parser<GetAuthkeyRsp> PARSER;
        
        private GetAuthkeyRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetAuthkeyRsp() {
            this.memoizedIsInitialized = -1;
            this.authAppid_ = "";
            this.gameBiz_ = "";
            this.authkey_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetAuthkeyRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetAuthkeyRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.authkey_ = s;
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.authAppid_ = s;
                            continue;
                        }
                        case 48: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 72: {
                            this.authkeyVer_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            final String s = input.readStringRequireUtf8();
                            this.gameBiz_ = s;
                            continue;
                        }
                        case 120: {
                            this.signType_ = input.readUInt32();
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
            return GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAuthkeyRsp.class, Builder.class);
        }
        
        @Override
        public String getAuthAppid() {
            final Object ref = this.authAppid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.authAppid_ = s);
        }
        
        @Override
        public ByteString getAuthAppidBytes() {
            final Object ref = this.authAppid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.authAppid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getSignType() {
            return this.signType_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getAuthkeyVer() {
            return this.authkeyVer_;
        }
        
        @Override
        public String getGameBiz() {
            final Object ref = this.gameBiz_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gameBiz_ = s);
        }
        
        @Override
        public ByteString getGameBizBytes() {
            final Object ref = this.gameBiz_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gameBiz_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAuthkey() {
            final Object ref = this.authkey_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.authkey_ = s);
        }
        
        @Override
        public ByteString getAuthkeyBytes() {
            final Object ref = this.authkey_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.authkey_ = b);
            }
            return (ByteString)ref;
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
            if (!GeneratedMessageV3.isStringEmpty(this.authkey_)) {
                GeneratedMessageV3.writeString(output, 3, this.authkey_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authAppid_)) {
                GeneratedMessageV3.writeString(output, 4, this.authAppid_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(6, this.retcode_);
            }
            if (this.authkeyVer_ != 0) {
                output.writeUInt32(9, this.authkeyVer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gameBiz_)) {
                GeneratedMessageV3.writeString(output, 11, this.gameBiz_);
            }
            if (this.signType_ != 0) {
                output.writeUInt32(15, this.signType_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.authkey_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.authkey_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authAppid_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.authAppid_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.retcode_);
            }
            if (this.authkeyVer_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.authkeyVer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gameBiz_)) {
                size += GeneratedMessageV3.computeStringSize(11, this.gameBiz_);
            }
            if (this.signType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.signType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAuthkeyRsp)) {
                return super.equals(obj);
            }
            final GetAuthkeyRsp other = (GetAuthkeyRsp)obj;
            return this.getAuthAppid().equals(other.getAuthAppid()) && this.getSignType() == other.getSignType() && this.getRetcode() == other.getRetcode() && this.getAuthkeyVer() == other.getAuthkeyVer() && this.getGameBiz().equals(other.getGameBiz()) && this.getAuthkey().equals(other.getAuthkey()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getAuthAppid().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getSignType();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getAuthkeyVer();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getGameBiz().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getAuthkey().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetAuthkeyRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyRsp.PARSER, input);
        }
        
        public static GetAuthkeyRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetAuthkeyRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAuthkeyRsp.PARSER, input);
        }
        
        public static GetAuthkeyRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAuthkeyRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetAuthkeyRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyRsp.PARSER, input);
        }
        
        public static GetAuthkeyRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetAuthkeyRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetAuthkeyRsp prototype) {
            return GetAuthkeyRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetAuthkeyRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetAuthkeyRsp getDefaultInstance() {
            return GetAuthkeyRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetAuthkeyRsp> parser() {
            return GetAuthkeyRsp.PARSER;
        }
        
        @Override
        public Parser<GetAuthkeyRsp> getParserForType() {
            return GetAuthkeyRsp.PARSER;
        }
        
        @Override
        public GetAuthkeyRsp getDefaultInstanceForType() {
            return GetAuthkeyRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetAuthkeyRsp();
            PARSER = new AbstractParser<GetAuthkeyRsp>() {
                @Override
                public GetAuthkeyRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetAuthkeyRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAuthkeyRspOrBuilder
        {
            private Object authAppid_;
            private int signType_;
            private int retcode_;
            private int authkeyVer_;
            private Object gameBiz_;
            private Object authkey_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAuthkeyRsp.class, Builder.class);
            }
            
            private Builder() {
                this.authAppid_ = "";
                this.gameBiz_ = "";
                this.authkey_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.authAppid_ = "";
                this.gameBiz_ = "";
                this.authkey_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetAuthkeyRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.authAppid_ = "";
                this.signType_ = 0;
                this.retcode_ = 0;
                this.authkeyVer_ = 0;
                this.gameBiz_ = "";
                this.authkey_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
            }
            
            @Override
            public GetAuthkeyRsp getDefaultInstanceForType() {
                return GetAuthkeyRsp.getDefaultInstance();
            }
            
            @Override
            public GetAuthkeyRsp build() {
                final GetAuthkeyRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetAuthkeyRsp buildPartial() {
                final GetAuthkeyRsp result = new GetAuthkeyRsp(this);
                result.authAppid_ = this.authAppid_;
                result.signType_ = this.signType_;
                result.retcode_ = this.retcode_;
                result.authkeyVer_ = this.authkeyVer_;
                result.gameBiz_ = this.gameBiz_;
                result.authkey_ = this.authkey_;
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
                if (other instanceof GetAuthkeyRsp) {
                    return this.mergeFrom((GetAuthkeyRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetAuthkeyRsp other) {
                if (other == GetAuthkeyRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.getAuthAppid().isEmpty()) {
                    this.authAppid_ = other.authAppid_;
                    this.onChanged();
                }
                if (other.getSignType() != 0) {
                    this.setSignType(other.getSignType());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getAuthkeyVer() != 0) {
                    this.setAuthkeyVer(other.getAuthkeyVer());
                }
                if (!other.getGameBiz().isEmpty()) {
                    this.gameBiz_ = other.gameBiz_;
                    this.onChanged();
                }
                if (!other.getAuthkey().isEmpty()) {
                    this.authkey_ = other.authkey_;
                    this.onChanged();
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
                GetAuthkeyRsp parsedMessage = null;
                try {
                    parsedMessage = GetAuthkeyRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetAuthkeyRsp)e.getUnfinishedMessage();
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
            public String getAuthAppid() {
                final Object ref = this.authAppid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.authAppid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAuthAppidBytes() {
                final Object ref = this.authAppid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.authAppid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAuthAppid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.authAppid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthAppid() {
                this.authAppid_ = GetAuthkeyRsp.getDefaultInstance().getAuthAppid();
                this.onChanged();
                return this;
            }
            
            public Builder setAuthAppidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.authAppid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSignType() {
                return this.signType_;
            }
            
            public Builder setSignType(final int value) {
                this.signType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSignType() {
                this.signType_ = 0;
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
            public int getAuthkeyVer() {
                return this.authkeyVer_;
            }
            
            public Builder setAuthkeyVer(final int value) {
                this.authkeyVer_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthkeyVer() {
                this.authkeyVer_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGameBiz() {
                final Object ref = this.gameBiz_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gameBiz_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGameBizBytes() {
                final Object ref = this.gameBiz_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gameBiz_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGameBiz(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gameBiz_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGameBiz() {
                this.gameBiz_ = GetAuthkeyRsp.getDefaultInstance().getGameBiz();
                this.onChanged();
                return this;
            }
            
            public Builder setGameBizBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gameBiz_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAuthkey() {
                final Object ref = this.authkey_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.authkey_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAuthkeyBytes() {
                final Object ref = this.authkey_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.authkey_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAuthkey(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.authkey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthkey() {
                this.authkey_ = GetAuthkeyRsp.getDefaultInstance().getAuthkey();
                this.onChanged();
                return this;
            }
            
            public Builder setAuthkeyBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.authkey_ = value;
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
    
    public interface GetAuthkeyRspOrBuilder extends MessageOrBuilder
    {
        String getAuthAppid();
        
        ByteString getAuthAppidBytes();
        
        int getSignType();
        
        int getRetcode();
        
        int getAuthkeyVer();
        
        String getGameBiz();
        
        ByteString getGameBizBytes();
        
        String getAuthkey();
        
        ByteString getAuthkeyBytes();
    }
}
