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

public final class SetPlayerSignatureRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetPlayerSignatureRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetPlayerSignatureRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetPlayerSignatureRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetPlayerSignatureRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bSetPlayerSignatureRsp.proto\";\n\u0015SetPlayerSignatureRsp\u0012\u0011\n\tsignature\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetPlayerSignatureRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SetPlayerSignatureRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetPlayerSignatureRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_descriptor, new String[] { "Signature", "Retcode" });
    }
    
    public static final class SetPlayerSignatureRsp extends GeneratedMessageV3 implements SetPlayerSignatureRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        private volatile Object signature_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SetPlayerSignatureRsp DEFAULT_INSTANCE;
        private static final Parser<SetPlayerSignatureRsp> PARSER;
        
        private SetPlayerSignatureRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetPlayerSignatureRsp() {
            this.memoizedIsInitialized = -1;
            this.signature_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetPlayerSignatureRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetPlayerSignatureRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.signature_ = s;
                            continue;
                        }
                        case 32: {
                            this.retcode_ = input.readInt32();
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
            return SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerSignatureRsp.class, Builder.class);
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
        public int getRetcode() {
            return this.retcode_;
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
                GeneratedMessageV3.writeString(output, 1, this.signature_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(4, this.retcode_);
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
                size += GeneratedMessageV3.computeStringSize(1, this.signature_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetPlayerSignatureRsp)) {
                return super.equals(obj);
            }
            final SetPlayerSignatureRsp other = (SetPlayerSignatureRsp)obj;
            return this.getSignature().equals(other.getSignature()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSignature().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetPlayerSignatureRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetPlayerSignatureRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureRsp.PARSER, input);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerSignatureRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerSignatureRsp.PARSER, input);
        }
        
        public static SetPlayerSignatureRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetPlayerSignatureRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureRsp.PARSER, input);
        }
        
        public static SetPlayerSignatureRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetPlayerSignatureRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetPlayerSignatureRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetPlayerSignatureRsp prototype) {
            return SetPlayerSignatureRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetPlayerSignatureRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetPlayerSignatureRsp getDefaultInstance() {
            return SetPlayerSignatureRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetPlayerSignatureRsp> parser() {
            return SetPlayerSignatureRsp.PARSER;
        }
        
        @Override
        public Parser<SetPlayerSignatureRsp> getParserForType() {
            return SetPlayerSignatureRsp.PARSER;
        }
        
        @Override
        public SetPlayerSignatureRsp getDefaultInstanceForType() {
            return SetPlayerSignatureRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetPlayerSignatureRsp();
            PARSER = new AbstractParser<SetPlayerSignatureRsp>() {
                @Override
                public SetPlayerSignatureRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetPlayerSignatureRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetPlayerSignatureRspOrBuilder
        {
            private Object signature_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetPlayerSignatureRsp.class, Builder.class);
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
                if (SetPlayerSignatureRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.signature_ = "";
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetPlayerSignatureRspOuterClass.internal_static_SetPlayerSignatureRsp_descriptor;
            }
            
            @Override
            public SetPlayerSignatureRsp getDefaultInstanceForType() {
                return SetPlayerSignatureRsp.getDefaultInstance();
            }
            
            @Override
            public SetPlayerSignatureRsp build() {
                final SetPlayerSignatureRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetPlayerSignatureRsp buildPartial() {
                final SetPlayerSignatureRsp result = new SetPlayerSignatureRsp(this);
                result.signature_ = this.signature_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof SetPlayerSignatureRsp) {
                    return this.mergeFrom((SetPlayerSignatureRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetPlayerSignatureRsp other) {
                if (other == SetPlayerSignatureRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.getSignature().isEmpty()) {
                    this.signature_ = other.signature_;
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                SetPlayerSignatureRsp parsedMessage = null;
                try {
                    parsedMessage = SetPlayerSignatureRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetPlayerSignatureRsp)e.getUnfinishedMessage();
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
                this.signature_ = SetPlayerSignatureRsp.getDefaultInstance().getSignature();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SetPlayerSignatureRspOrBuilder extends MessageOrBuilder
    {
        String getSignature();
        
        ByteString getSignatureBytes();
        
        int getRetcode();
    }
}
