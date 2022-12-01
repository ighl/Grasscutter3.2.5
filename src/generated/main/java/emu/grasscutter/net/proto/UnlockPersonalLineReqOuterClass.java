// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class UnlockPersonalLineReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_UnlockPersonalLineReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UnlockPersonalLineReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UnlockPersonalLineReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UnlockPersonalLineReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bUnlockPersonalLineReq.proto\"1\n\u0015UnlockPersonalLineReq\u0012\u0018\n\u0010personal_line_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UnlockPersonalLineReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UnlockPersonalLineReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UnlockPersonalLineReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_descriptor, new String[] { "PersonalLineId" });
    }
    
    public static final class UnlockPersonalLineReq extends GeneratedMessageV3 implements UnlockPersonalLineReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PERSONAL_LINE_ID_FIELD_NUMBER = 4;
        private int personalLineId_;
        private byte memoizedIsInitialized;
        private static final UnlockPersonalLineReq DEFAULT_INSTANCE;
        private static final Parser<UnlockPersonalLineReq> PARSER;
        
        private UnlockPersonalLineReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private UnlockPersonalLineReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UnlockPersonalLineReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UnlockPersonalLineReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.personalLineId_ = input.readUInt32();
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
            return UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockPersonalLineReq.class, Builder.class);
        }
        
        @Override
        public int getPersonalLineId() {
            return this.personalLineId_;
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
            if (this.personalLineId_ != 0) {
                output.writeUInt32(4, this.personalLineId_);
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
            if (this.personalLineId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.personalLineId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockPersonalLineReq)) {
                return super.equals(obj);
            }
            final UnlockPersonalLineReq other = (UnlockPersonalLineReq)obj;
            return this.getPersonalLineId() == other.getPersonalLineId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getPersonalLineId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UnlockPersonalLineReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineReq.PARSER, input);
        }
        
        public static UnlockPersonalLineReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineReq.PARSER, input, extensionRegistry);
        }
        
        public static UnlockPersonalLineReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockPersonalLineReq.PARSER, input);
        }
        
        public static UnlockPersonalLineReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockPersonalLineReq.PARSER, input, extensionRegistry);
        }
        
        public static UnlockPersonalLineReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineReq.PARSER, input);
        }
        
        public static UnlockPersonalLineReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UnlockPersonalLineReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UnlockPersonalLineReq prototype) {
            return UnlockPersonalLineReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UnlockPersonalLineReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UnlockPersonalLineReq getDefaultInstance() {
            return UnlockPersonalLineReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<UnlockPersonalLineReq> parser() {
            return UnlockPersonalLineReq.PARSER;
        }
        
        @Override
        public Parser<UnlockPersonalLineReq> getParserForType() {
            return UnlockPersonalLineReq.PARSER;
        }
        
        @Override
        public UnlockPersonalLineReq getDefaultInstanceForType() {
            return UnlockPersonalLineReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UnlockPersonalLineReq();
            PARSER = new AbstractParser<UnlockPersonalLineReq>() {
                @Override
                public UnlockPersonalLineReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UnlockPersonalLineReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnlockPersonalLineReqOrBuilder
        {
            private int personalLineId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockPersonalLineReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UnlockPersonalLineReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.personalLineId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UnlockPersonalLineReqOuterClass.internal_static_UnlockPersonalLineReq_descriptor;
            }
            
            @Override
            public UnlockPersonalLineReq getDefaultInstanceForType() {
                return UnlockPersonalLineReq.getDefaultInstance();
            }
            
            @Override
            public UnlockPersonalLineReq build() {
                final UnlockPersonalLineReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UnlockPersonalLineReq buildPartial() {
                final UnlockPersonalLineReq result = new UnlockPersonalLineReq(this);
                result.personalLineId_ = this.personalLineId_;
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
                if (other instanceof UnlockPersonalLineReq) {
                    return this.mergeFrom((UnlockPersonalLineReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UnlockPersonalLineReq other) {
                if (other == UnlockPersonalLineReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getPersonalLineId() != 0) {
                    this.setPersonalLineId(other.getPersonalLineId());
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
                UnlockPersonalLineReq parsedMessage = null;
                try {
                    parsedMessage = UnlockPersonalLineReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UnlockPersonalLineReq)e.getUnfinishedMessage();
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
            public int getPersonalLineId() {
                return this.personalLineId_;
            }
            
            public Builder setPersonalLineId(final int value) {
                this.personalLineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPersonalLineId() {
                this.personalLineId_ = 0;
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
    
    public interface UnlockPersonalLineReqOrBuilder extends MessageOrBuilder
    {
        int getPersonalLineId();
    }
}
