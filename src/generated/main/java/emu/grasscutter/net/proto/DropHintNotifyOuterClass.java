// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class DropHintNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DropHintNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DropHintNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DropHintNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DropHintNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014DropHintNotify.proto\u001a\fVector.proto\"A\n\u000eDropHintNotify\u0012\u0019\n\bposition\u0018\u0007 \u0001(\u000b2\u0007.Vector\u0012\u0014\n\fitem_id_list\u0018\u000e \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DropHintNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_DropHintNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DropHintNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DropHintNotifyOuterClass.internal_static_DropHintNotify_descriptor, new String[] { "Position", "ItemIdList" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class DropHintNotify extends GeneratedMessageV3 implements DropHintNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POSITION_FIELD_NUMBER = 7;
        private VectorOuterClass.Vector position_;
        public static final int ITEM_ID_LIST_FIELD_NUMBER = 14;
        private Internal.IntList itemIdList_;
        private int itemIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final DropHintNotify DEFAULT_INSTANCE;
        private static final Parser<DropHintNotify> PARSER;
        
        private DropHintNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.itemIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DropHintNotify() {
            this.itemIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.itemIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DropHintNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DropHintNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.position_ != null) {
                                subBuilder = this.position_.toBuilder();
                            }
                            this.position_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.position_);
                                this.position_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.itemIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.itemIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.itemIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DropHintNotifyOuterClass.internal_static_DropHintNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DropHintNotifyOuterClass.internal_static_DropHintNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DropHintNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasPosition() {
            return this.position_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPosition() {
            return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
            return this.getPosition();
        }
        
        @Override
        public List<Integer> getItemIdListList() {
            return this.itemIdList_;
        }
        
        @Override
        public int getItemIdListCount() {
            return this.itemIdList_.size();
        }
        
        @Override
        public int getItemIdList(final int index) {
            return this.itemIdList_.getInt(index);
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
            this.getSerializedSize();
            if (this.position_ != null) {
                output.writeMessage(7, this.getPosition());
            }
            if (this.getItemIdListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.itemIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.itemIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.itemIdList_.getInt(i));
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
            if (this.position_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getPosition());
            }
            int dataSize = 0;
            for (int i = 0; i < this.itemIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.itemIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getItemIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.itemIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DropHintNotify)) {
                return super.equals(obj);
            }
            final DropHintNotify other = (DropHintNotify)obj;
            return this.hasPosition() == other.hasPosition() && (!this.hasPosition() || this.getPosition().equals(other.getPosition())) && this.getItemIdListList().equals(other.getItemIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPosition()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getPosition().hashCode();
            }
            if (this.getItemIdListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getItemIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DropHintNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data);
        }
        
        public static DropHintNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DropHintNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data);
        }
        
        public static DropHintNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DropHintNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data);
        }
        
        public static DropHintNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DropHintNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DropHintNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DropHintNotify.PARSER, input);
        }
        
        public static DropHintNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DropHintNotify.PARSER, input, extensionRegistry);
        }
        
        public static DropHintNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DropHintNotify.PARSER, input);
        }
        
        public static DropHintNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DropHintNotify.PARSER, input, extensionRegistry);
        }
        
        public static DropHintNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DropHintNotify.PARSER, input);
        }
        
        public static DropHintNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DropHintNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DropHintNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DropHintNotify prototype) {
            return DropHintNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DropHintNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DropHintNotify getDefaultInstance() {
            return DropHintNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DropHintNotify> parser() {
            return DropHintNotify.PARSER;
        }
        
        @Override
        public Parser<DropHintNotify> getParserForType() {
            return DropHintNotify.PARSER;
        }
        
        @Override
        public DropHintNotify getDefaultInstanceForType() {
            return DropHintNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DropHintNotify();
            PARSER = new AbstractParser<DropHintNotify>() {
                @Override
                public DropHintNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DropHintNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DropHintNotifyOrBuilder
        {
            private int bitField0_;
            private VectorOuterClass.Vector position_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> positionBuilder_;
            private Internal.IntList itemIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DropHintNotifyOuterClass.internal_static_DropHintNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DropHintNotifyOuterClass.internal_static_DropHintNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DropHintNotify.class, Builder.class);
            }
            
            private Builder() {
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DropHintNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                }
                else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DropHintNotifyOuterClass.internal_static_DropHintNotify_descriptor;
            }
            
            @Override
            public DropHintNotify getDefaultInstanceForType() {
                return DropHintNotify.getDefaultInstance();
            }
            
            @Override
            public DropHintNotify build() {
                final DropHintNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DropHintNotify buildPartial() {
                final DropHintNotify result = new DropHintNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.positionBuilder_ == null) {
                    result.position_ = this.position_;
                }
                else {
                    result.position_ = this.positionBuilder_.build();
                }
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.itemIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.itemIdList_ = this.itemIdList_;
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
                if (other instanceof DropHintNotify) {
                    return this.mergeFrom((DropHintNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DropHintNotify other) {
                if (other == DropHintNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasPosition()) {
                    this.mergePosition(other.getPosition());
                }
                if (!other.itemIdList_.isEmpty()) {
                    if (this.itemIdList_.isEmpty()) {
                        this.itemIdList_ = other.itemIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureItemIdListIsMutable();
                        this.itemIdList_.addAll(other.itemIdList_);
                    }
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
                DropHintNotify parsedMessage = null;
                try {
                    parsedMessage = DropHintNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DropHintNotify)e.getUnfinishedMessage();
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
            public boolean hasPosition() {
                return this.positionBuilder_ != null || this.position_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPosition() {
                if (this.positionBuilder_ == null) {
                    return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
                }
                return this.positionBuilder_.getMessage();
            }
            
            public Builder setPosition(final VectorOuterClass.Vector value) {
                if (this.positionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.position_ = value;
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPosition(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.positionBuilder_ == null) {
                    this.position_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePosition(final VectorOuterClass.Vector value) {
                if (this.positionBuilder_ == null) {
                    if (this.position_ != null) {
                        this.position_ = VectorOuterClass.Vector.newBuilder(this.position_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.position_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.positionBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPosition() {
                if (this.positionBuilder_ == null) {
                    this.position_ = null;
                    this.onChanged();
                }
                else {
                    this.position_ = null;
                    this.positionBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPositionBuilder() {
                this.onChanged();
                return this.getPositionFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
                if (this.positionBuilder_ != null) {
                    return this.positionBuilder_.getMessageOrBuilder();
                }
                return (this.position_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.position_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPosition(), this.getParentForChildren(), this.isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }
            
            private void ensureItemIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemIdList_ = GeneratedMessageV3.mutableCopy(this.itemIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getItemIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.itemIdList_) : this.itemIdList_;
            }
            
            @Override
            public int getItemIdListCount() {
                return this.itemIdList_.size();
            }
            
            @Override
            public int getItemIdList(final int index) {
                return this.itemIdList_.getInt(index);
            }
            
            public Builder setItemIdList(final int index, final int value) {
                this.ensureItemIdListIsMutable();
                this.itemIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addItemIdList(final int value) {
                this.ensureItemIdListIsMutable();
                this.itemIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllItemIdList(final Iterable<? extends Integer> values) {
                this.ensureItemIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.itemIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearItemIdList() {
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface DropHintNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasPosition();
        
        VectorOuterClass.Vector getPosition();
        
        VectorOuterClass.VectorOrBuilder getPositionOrBuilder();
        
        List<Integer> getItemIdListList();
        
        int getItemIdListCount();
        
        int getItemIdList(final int p0);
    }
}
