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

public final class OfferingInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_OfferingInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_OfferingInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private OfferingInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OfferingInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012OfferingInfo.proto\"#\n\fOfferingInfo\u0012\u0013\n\u000boffering_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OfferingInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_OfferingInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OfferingInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(OfferingInfoOuterClass.internal_static_OfferingInfo_descriptor, new String[] { "OfferingId" });
    }
    
    public static final class OfferingInfo extends GeneratedMessageV3 implements OfferingInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OFFERING_ID_FIELD_NUMBER = 1;
        private int offeringId_;
        private byte memoizedIsInitialized;
        private static final OfferingInfo DEFAULT_INSTANCE;
        private static final Parser<OfferingInfo> PARSER;
        
        private OfferingInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private OfferingInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new OfferingInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private OfferingInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.offeringId_ = input.readUInt32();
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
            return OfferingInfoOuterClass.internal_static_OfferingInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OfferingInfoOuterClass.internal_static_OfferingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferingInfo.class, Builder.class);
        }
        
        @Override
        public int getOfferingId() {
            return this.offeringId_;
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
            if (this.offeringId_ != 0) {
                output.writeUInt32(1, this.offeringId_);
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
            if (this.offeringId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.offeringId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OfferingInfo)) {
                return super.equals(obj);
            }
            final OfferingInfo other = (OfferingInfo)obj;
            return this.getOfferingId() == other.getOfferingId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getOfferingId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static OfferingInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data);
        }
        
        public static OfferingInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OfferingInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data);
        }
        
        public static OfferingInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OfferingInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data);
        }
        
        public static OfferingInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OfferingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OfferingInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OfferingInfo.PARSER, input);
        }
        
        public static OfferingInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OfferingInfo.PARSER, input, extensionRegistry);
        }
        
        public static OfferingInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OfferingInfo.PARSER, input);
        }
        
        public static OfferingInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OfferingInfo.PARSER, input, extensionRegistry);
        }
        
        public static OfferingInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OfferingInfo.PARSER, input);
        }
        
        public static OfferingInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OfferingInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return OfferingInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final OfferingInfo prototype) {
            return OfferingInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == OfferingInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static OfferingInfo getDefaultInstance() {
            return OfferingInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<OfferingInfo> parser() {
            return OfferingInfo.PARSER;
        }
        
        @Override
        public Parser<OfferingInfo> getParserForType() {
            return OfferingInfo.PARSER;
        }
        
        @Override
        public OfferingInfo getDefaultInstanceForType() {
            return OfferingInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new OfferingInfo();
            PARSER = new AbstractParser<OfferingInfo>() {
                @Override
                public OfferingInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new OfferingInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OfferingInfoOrBuilder
        {
            private int offeringId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return OfferingInfoOuterClass.internal_static_OfferingInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OfferingInfoOuterClass.internal_static_OfferingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferingInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (OfferingInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.offeringId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return OfferingInfoOuterClass.internal_static_OfferingInfo_descriptor;
            }
            
            @Override
            public OfferingInfo getDefaultInstanceForType() {
                return OfferingInfo.getDefaultInstance();
            }
            
            @Override
            public OfferingInfo build() {
                final OfferingInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public OfferingInfo buildPartial() {
                final OfferingInfo result = new OfferingInfo(this);
                result.offeringId_ = this.offeringId_;
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
                if (other instanceof OfferingInfo) {
                    return this.mergeFrom((OfferingInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final OfferingInfo other) {
                if (other == OfferingInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getOfferingId() != 0) {
                    this.setOfferingId(other.getOfferingId());
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
                OfferingInfo parsedMessage = null;
                try {
                    parsedMessage = OfferingInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (OfferingInfo)e.getUnfinishedMessage();
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
            public int getOfferingId() {
                return this.offeringId_;
            }
            
            public Builder setOfferingId(final int value) {
                this.offeringId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOfferingId() {
                this.offeringId_ = 0;
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
    
    public interface OfferingInfoOrBuilder extends MessageOrBuilder
    {
        int getOfferingId();
    }
}
