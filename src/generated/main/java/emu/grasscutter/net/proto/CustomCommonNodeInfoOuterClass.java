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

public final class CustomCommonNodeInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_CustomCommonNodeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CustomCommonNodeInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CustomCommonNodeInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CustomCommonNodeInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCustomCommonNodeInfo.proto\"X\n\u0014CustomCommonNodeInfo\u0012\u0014\n\fparent_index\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tconfig_id\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fslot_identifier\u0018\u0003 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CustomCommonNodeInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CustomCommonNodeInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CustomCommonNodeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor, new String[] { "ParentIndex", "ConfigId", "SlotIdentifier" });
    }
    
    public static final class CustomCommonNodeInfo extends GeneratedMessageV3 implements CustomCommonNodeInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARENT_INDEX_FIELD_NUMBER = 1;
        private int parentIndex_;
        public static final int CONFIG_ID_FIELD_NUMBER = 2;
        private int configId_;
        public static final int SLOT_IDENTIFIER_FIELD_NUMBER = 3;
        private volatile Object slotIdentifier_;
        private byte memoizedIsInitialized;
        private static final CustomCommonNodeInfo DEFAULT_INSTANCE;
        private static final Parser<CustomCommonNodeInfo> PARSER;
        
        private CustomCommonNodeInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CustomCommonNodeInfo() {
            this.memoizedIsInitialized = -1;
            this.slotIdentifier_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CustomCommonNodeInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CustomCommonNodeInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.parentIndex_ = input.readInt32();
                            continue;
                        }
                        case 16: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.slotIdentifier_ = s;
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
            return CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomCommonNodeInfo.class, Builder.class);
        }
        
        @Override
        public int getParentIndex() {
            return this.parentIndex_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public String getSlotIdentifier() {
            final Object ref = this.slotIdentifier_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.slotIdentifier_ = s);
        }
        
        @Override
        public ByteString getSlotIdentifierBytes() {
            final Object ref = this.slotIdentifier_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.slotIdentifier_ = b);
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
            if (this.parentIndex_ != 0) {
                output.writeInt32(1, this.parentIndex_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(2, this.configId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.slotIdentifier_)) {
                GeneratedMessageV3.writeString(output, 3, this.slotIdentifier_);
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
            if (this.parentIndex_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.parentIndex_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.configId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.slotIdentifier_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.slotIdentifier_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomCommonNodeInfo)) {
                return super.equals(obj);
            }
            final CustomCommonNodeInfo other = (CustomCommonNodeInfo)obj;
            return this.getParentIndex() == other.getParentIndex() && this.getConfigId() == other.getConfigId() && this.getSlotIdentifier().equals(other.getSlotIdentifier()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getParentIndex();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getConfigId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSlotIdentifier().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CustomCommonNodeInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomCommonNodeInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomCommonNodeInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomCommonNodeInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomCommonNodeInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomCommonNodeInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomCommonNodeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomCommonNodeInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomCommonNodeInfo.PARSER, input);
        }
        
        public static CustomCommonNodeInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomCommonNodeInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomCommonNodeInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomCommonNodeInfo.PARSER, input);
        }
        
        public static CustomCommonNodeInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomCommonNodeInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomCommonNodeInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomCommonNodeInfo.PARSER, input);
        }
        
        public static CustomCommonNodeInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomCommonNodeInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CustomCommonNodeInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CustomCommonNodeInfo prototype) {
            return CustomCommonNodeInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CustomCommonNodeInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CustomCommonNodeInfo getDefaultInstance() {
            return CustomCommonNodeInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<CustomCommonNodeInfo> parser() {
            return CustomCommonNodeInfo.PARSER;
        }
        
        @Override
        public Parser<CustomCommonNodeInfo> getParserForType() {
            return CustomCommonNodeInfo.PARSER;
        }
        
        @Override
        public CustomCommonNodeInfo getDefaultInstanceForType() {
            return CustomCommonNodeInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CustomCommonNodeInfo();
            PARSER = new AbstractParser<CustomCommonNodeInfo>() {
                @Override
                public CustomCommonNodeInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CustomCommonNodeInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomCommonNodeInfoOrBuilder
        {
            private int parentIndex_;
            private int configId_;
            private Object slotIdentifier_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomCommonNodeInfo.class, Builder.class);
            }
            
            private Builder() {
                this.slotIdentifier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.slotIdentifier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CustomCommonNodeInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.parentIndex_ = 0;
                this.configId_ = 0;
                this.slotIdentifier_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
            }
            
            @Override
            public CustomCommonNodeInfo getDefaultInstanceForType() {
                return CustomCommonNodeInfo.getDefaultInstance();
            }
            
            @Override
            public CustomCommonNodeInfo build() {
                final CustomCommonNodeInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CustomCommonNodeInfo buildPartial() {
                final CustomCommonNodeInfo result = new CustomCommonNodeInfo(this);
                result.parentIndex_ = this.parentIndex_;
                result.configId_ = this.configId_;
                result.slotIdentifier_ = this.slotIdentifier_;
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
                if (other instanceof CustomCommonNodeInfo) {
                    return this.mergeFrom((CustomCommonNodeInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CustomCommonNodeInfo other) {
                if (other == CustomCommonNodeInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getParentIndex() != 0) {
                    this.setParentIndex(other.getParentIndex());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (!other.getSlotIdentifier().isEmpty()) {
                    this.slotIdentifier_ = other.slotIdentifier_;
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
                CustomCommonNodeInfo parsedMessage = null;
                try {
                    parsedMessage = CustomCommonNodeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CustomCommonNodeInfo)e.getUnfinishedMessage();
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
            public int getParentIndex() {
                return this.parentIndex_;
            }
            
            public Builder setParentIndex(final int value) {
                this.parentIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentIndex() {
                this.parentIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getSlotIdentifier() {
                final Object ref = this.slotIdentifier_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.slotIdentifier_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSlotIdentifierBytes() {
                final Object ref = this.slotIdentifier_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.slotIdentifier_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSlotIdentifier(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.slotIdentifier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSlotIdentifier() {
                this.slotIdentifier_ = CustomCommonNodeInfo.getDefaultInstance().getSlotIdentifier();
                this.onChanged();
                return this;
            }
            
            public Builder setSlotIdentifierBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.slotIdentifier_ = value;
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
    
    public interface CustomCommonNodeInfoOrBuilder extends MessageOrBuilder
    {
        int getParentIndex();
        
        int getConfigId();
        
        String getSlotIdentifier();
        
        ByteString getSlotIdentifierBytes();
    }
}
