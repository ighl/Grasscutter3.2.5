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

public final class GetAuthkeyReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetAuthkeyReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetAuthkeyReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetAuthkeyReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetAuthkeyReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013GetAuthkeyReq.proto\"K\n\rGetAuthkeyReq\u0012\u0012\n\nauth_appid\u0018\u000e \u0001(\t\u0012\u0011\n\tsign_type\u0018\u0007 \u0001(\r\u0012\u0013\n\u000bauthkey_ver\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetAuthkeyReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetAuthkeyReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetAuthkeyReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor, new String[] { "AuthAppid", "SignType", "AuthkeyVer" });
    }
    
    public static final class GetAuthkeyReq extends GeneratedMessageV3 implements GetAuthkeyReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AUTH_APPID_FIELD_NUMBER = 14;
        private volatile Object authAppid_;
        public static final int SIGN_TYPE_FIELD_NUMBER = 7;
        private int signType_;
        public static final int AUTHKEY_VER_FIELD_NUMBER = 13;
        private int authkeyVer_;
        private byte memoizedIsInitialized;
        private static final GetAuthkeyReq DEFAULT_INSTANCE;
        private static final Parser<GetAuthkeyReq> PARSER;
        
        private GetAuthkeyReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetAuthkeyReq() {
            this.memoizedIsInitialized = -1;
            this.authAppid_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetAuthkeyReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetAuthkeyReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.signType_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.authkeyVer_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            final String s = input.readStringRequireUtf8();
                            this.authAppid_ = s;
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
            return GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAuthkeyReq.class, Builder.class);
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
        public int getAuthkeyVer() {
            return this.authkeyVer_;
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
            if (this.signType_ != 0) {
                output.writeUInt32(7, this.signType_);
            }
            if (this.authkeyVer_ != 0) {
                output.writeUInt32(13, this.authkeyVer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authAppid_)) {
                GeneratedMessageV3.writeString(output, 14, this.authAppid_);
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
            if (this.signType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.signType_);
            }
            if (this.authkeyVer_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.authkeyVer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authAppid_)) {
                size += GeneratedMessageV3.computeStringSize(14, this.authAppid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAuthkeyReq)) {
                return super.equals(obj);
            }
            final GetAuthkeyReq other = (GetAuthkeyReq)obj;
            return this.getAuthAppid().equals(other.getAuthAppid()) && this.getSignType() == other.getSignType() && this.getAuthkeyVer() == other.getAuthkeyVer() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getAuthAppid().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getSignType();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getAuthkeyVer();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetAuthkeyReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data);
        }
        
        public static GetAuthkeyReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAuthkeyReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAuthkeyReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyReq.PARSER, input);
        }
        
        public static GetAuthkeyReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyReq.PARSER, input, extensionRegistry);
        }
        
        public static GetAuthkeyReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAuthkeyReq.PARSER, input);
        }
        
        public static GetAuthkeyReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAuthkeyReq.PARSER, input, extensionRegistry);
        }
        
        public static GetAuthkeyReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyReq.PARSER, input);
        }
        
        public static GetAuthkeyReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAuthkeyReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetAuthkeyReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetAuthkeyReq prototype) {
            return GetAuthkeyReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetAuthkeyReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetAuthkeyReq getDefaultInstance() {
            return GetAuthkeyReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetAuthkeyReq> parser() {
            return GetAuthkeyReq.PARSER;
        }
        
        @Override
        public Parser<GetAuthkeyReq> getParserForType() {
            return GetAuthkeyReq.PARSER;
        }
        
        @Override
        public GetAuthkeyReq getDefaultInstanceForType() {
            return GetAuthkeyReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetAuthkeyReq();
            PARSER = new AbstractParser<GetAuthkeyReq>() {
                @Override
                public GetAuthkeyReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetAuthkeyReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAuthkeyReqOrBuilder
        {
            private Object authAppid_;
            private int signType_;
            private int authkeyVer_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAuthkeyReq.class, Builder.class);
            }
            
            private Builder() {
                this.authAppid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.authAppid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetAuthkeyReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.authAppid_ = "";
                this.signType_ = 0;
                this.authkeyVer_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
            }
            
            @Override
            public GetAuthkeyReq getDefaultInstanceForType() {
                return GetAuthkeyReq.getDefaultInstance();
            }
            
            @Override
            public GetAuthkeyReq build() {
                final GetAuthkeyReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetAuthkeyReq buildPartial() {
                final GetAuthkeyReq result = new GetAuthkeyReq(this);
                result.authAppid_ = this.authAppid_;
                result.signType_ = this.signType_;
                result.authkeyVer_ = this.authkeyVer_;
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
                if (other instanceof GetAuthkeyReq) {
                    return this.mergeFrom((GetAuthkeyReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetAuthkeyReq other) {
                if (other == GetAuthkeyReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.getAuthAppid().isEmpty()) {
                    this.authAppid_ = other.authAppid_;
                    this.onChanged();
                }
                if (other.getSignType() != 0) {
                    this.setSignType(other.getSignType());
                }
                if (other.getAuthkeyVer() != 0) {
                    this.setAuthkeyVer(other.getAuthkeyVer());
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
                GetAuthkeyReq parsedMessage = null;
                try {
                    parsedMessage = GetAuthkeyReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetAuthkeyReq)e.getUnfinishedMessage();
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
                this.authAppid_ = GetAuthkeyReq.getDefaultInstance().getAuthAppid();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GetAuthkeyReqOrBuilder extends MessageOrBuilder
    {
        String getAuthAppid();
        
        ByteString getAuthAppidBytes();
        
        int getSignType();
        
        int getAuthkeyVer();
    }
}
