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

public final class SetPlayerSignatureReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetPlayerSignatureReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetPlayerSignatureReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetPlayerSignatureReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetPlayerSignatureReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bSetPlayerSignatureReq.proto\"*\n\u0015SetPlayerSignatureReq\u0012\u0011\n\tsignature\u0018\u0003 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetPlayerSignatureReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SetPlayerSignatureReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetPlayerSignatureReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor, new String[] { "Signature" });
    }
    
    public static final class SetPlayerSignatureReq extends GeneratedMessageV3 implements SetPlayerSignatureReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SIGNATURE_FIELD_NUMBER = 3;
        private volatile Object signature_;
        private byte memoizedIsInitialized;
        private static final SetPlayerSignatureReq DEFAULT_INSTANCE;
        private static final Parser<SetPlayerSignatureReq> PARSER;
        
        private SetPlayerSignatureReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetPlayerSignatureReq() {
            this.memoizedIsInitialized = -1;
            this.signature_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetPlayerSignatureReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetPlayerSignatureReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.signature_ = s;
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
            return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerSignatureReq.class, Builder.class);
        }
        
        @Override
        public String getSignature() {
            final Object ref = this.signature_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.signature_ = s);
        }
        
        @Override
        public ByteString getSignatureBytes() {
            final Object ref = this.signature_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.signature_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                GeneratedMessageV3.writeString(output, 3, this.signature_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.signature_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetPlayerSignatureReq)) {
                return super.equals(obj);
            }
            final SetPlayerSignatureReq other = (SetPlayerSignatureReq)obj;
            return this.getSignature().equals(other.getSignature()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSignature().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetPlayerSignatureReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureReq.PARSER, input);
        }
        
        public static SetPlayerSignatureReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureReq.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerSignatureReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerSignatureReq.PARSER, input);
        }
        
        public static SetPlayerSignatureReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerSignatureReq.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerSignatureReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureReq.PARSER, input);
        }
        
        public static SetPlayerSignatureReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetPlayerSignatureReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetPlayerSignatureReq prototype) {
            return SetPlayerSignatureReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetPlayerSignatureReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetPlayerSignatureReq getDefaultInstance() {
            return SetPlayerSignatureReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetPlayerSignatureReq> parser() {
            return SetPlayerSignatureReq.PARSER;
        }
        
        @Override
        public Parser<SetPlayerSignatureReq> getParserForType() {
            return SetPlayerSignatureReq.PARSER;
        }
        
        @Override
        public SetPlayerSignatureReq getDefaultInstanceForType() {
            return SetPlayerSignatureReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetPlayerSignatureReq();
            PARSER = new AbstractParser<SetPlayerSignatureReq>() {
                @Override
                public SetPlayerSignatureReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetPlayerSignatureReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetPlayerSignatureReqOrBuilder
        {
            private Object signature_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerSignatureReq.class, Builder.class);
            }
            
            private Builder() {
                this.signature_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.signature_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetPlayerSignatureReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.signature_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetPlayerSignatureReqOuterClass.internal_static_SetPlayerSignatureReq_descriptor;
            }
            
            @Override
            public SetPlayerSignatureReq getDefaultInstanceForType() {
                return SetPlayerSignatureReq.getDefaultInstance();
            }
            
            @Override
            public SetPlayerSignatureReq build() {
                final SetPlayerSignatureReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetPlayerSignatureReq buildPartial() {
                final SetPlayerSignatureReq result = new SetPlayerSignatureReq(this);
                result.signature_ = this.signature_;
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
                if (other instanceof SetPlayerSignatureReq) {
                    return this.mergeFrom((SetPlayerSignatureReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetPlayerSignatureReq other) {
                if (other == SetPlayerSignatureReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.getSignature().isEmpty()) {
                    this.signature_ = other.signature_;
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
                SetPlayerSignatureReq parsedMessage = null;
                try {
                    parsedMessage = SetPlayerSignatureReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetPlayerSignatureReq)e.getUnfinishedMessage();
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
            public String getSignature() {
                final Object ref = this.signature_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.signature_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSignatureBytes() {
                final Object ref = this.signature_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.signature_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSignature(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.signature_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSignature() {
                this.signature_ = SetPlayerSignatureReq.getDefaultInstance().getSignature();
                this.onChanged();
                return this;
            }
            
            public Builder setSignatureBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.signature_ = value;
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
    
    public interface SetPlayerSignatureReqOrBuilder extends MessageOrBuilder
    {
        String getSignature();
        
        ByteString getSignatureBytes();
    }
}
