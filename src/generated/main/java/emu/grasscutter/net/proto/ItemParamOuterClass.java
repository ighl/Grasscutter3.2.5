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

public final class ItemParamOuterClass
{
    private static final Descriptors.Descriptor internal_static_ItemParam_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ItemParam_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ItemParamOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ItemParamOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fItemParam.proto\"+\n\tItemParam\u0012\u000f\n\u0007item_id\u0018\u0001 \u0001(\r\u0012\r\n\u0005count\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ItemParamOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ItemParam_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ItemParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ItemParamOuterClass.internal_static_ItemParam_descriptor, new String[] { "ItemId", "Count" });
    }
    
    public static final class ItemParam extends GeneratedMessageV3 implements ItemParamOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_ID_FIELD_NUMBER = 1;
        private int itemId_;
        public static final int COUNT_FIELD_NUMBER = 2;
        private int count_;
        private byte memoizedIsInitialized;
        private static final ItemParam DEFAULT_INSTANCE;
        private static final Parser<ItemParam> PARSER;
        
        private ItemParam(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ItemParam() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ItemParam();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ItemParam(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.count_ = input.readUInt32();
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
            return ItemParamOuterClass.internal_static_ItemParam_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemParamOuterClass.internal_static_ItemParam_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemParam.class, Builder.class);
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public int getCount() {
            return this.count_;
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
            if (this.itemId_ != 0) {
                output.writeUInt32(1, this.itemId_);
            }
            if (this.count_ != 0) {
                output.writeUInt32(2, this.count_);
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
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.itemId_);
            }
            if (this.count_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.count_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemParam)) {
                return super.equals(obj);
            }
            final ItemParam other = (ItemParam)obj;
            return this.getItemId() == other.getItemId() && this.getCount() == other.getCount() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCount();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ItemParam parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data);
        }
        
        public static ItemParam parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ItemParam parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data);
        }
        
        public static ItemParam parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ItemParam parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data);
        }
        
        public static ItemParam parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ItemParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ItemParam parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ItemParam.PARSER, input);
        }
        
        public static ItemParam parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ItemParam.PARSER, input, extensionRegistry);
        }
        
        public static ItemParam parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ItemParam.PARSER, input);
        }
        
        public static ItemParam parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ItemParam.PARSER, input, extensionRegistry);
        }
        
        public static ItemParam parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ItemParam.PARSER, input);
        }
        
        public static ItemParam parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ItemParam.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ItemParam.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ItemParam prototype) {
            return ItemParam.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ItemParam.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ItemParam getDefaultInstance() {
            return ItemParam.DEFAULT_INSTANCE;
        }
        
        public static Parser<ItemParam> parser() {
            return ItemParam.PARSER;
        }
        
        @Override
        public Parser<ItemParam> getParserForType() {
            return ItemParam.PARSER;
        }
        
        @Override
        public ItemParam getDefaultInstanceForType() {
            return ItemParam.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ItemParam();
            PARSER = new AbstractParser<ItemParam>() {
                @Override
                public ItemParam parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ItemParam(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemParamOrBuilder
        {
            private int itemId_;
            private int count_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ItemParamOuterClass.internal_static_ItemParam_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemParamOuterClass.internal_static_ItemParam_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemParam.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ItemParam.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemId_ = 0;
                this.count_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ItemParamOuterClass.internal_static_ItemParam_descriptor;
            }
            
            @Override
            public ItemParam getDefaultInstanceForType() {
                return ItemParam.getDefaultInstance();
            }
            
            @Override
            public ItemParam build() {
                final ItemParam result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ItemParam buildPartial() {
                final ItemParam result = new ItemParam(this);
                result.itemId_ = this.itemId_;
                result.count_ = this.count_;
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
                if (other instanceof ItemParam) {
                    return this.mergeFrom((ItemParam)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ItemParam other) {
                if (other == ItemParam.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getCount() != 0) {
                    this.setCount(other.getCount());
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
                ItemParam parsedMessage = null;
                try {
                    parsedMessage = ItemParam.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemParam)e.getUnfinishedMessage();
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
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCount() {
                return this.count_;
            }
            
            public Builder setCount(final int value) {
                this.count_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCount() {
                this.count_ = 0;
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
    
    public interface ItemParamOrBuilder extends MessageOrBuilder
    {
        int getItemId();
        
        int getCount();
    }
}
