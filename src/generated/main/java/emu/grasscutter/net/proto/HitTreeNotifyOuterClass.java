// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class HitTreeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_HitTreeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HitTreeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HitTreeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HitTreeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013HitTreeNotify.proto\u001a\fVector.proto\"X\n\rHitTreeNotify\u0012\u0011\n\ttree_type\u0018\u000b \u0001(\r\u0012\u0019\n\btree_pos\u0018\u0002 \u0001(\u000b2\u0007.Vector\u0012\u0019\n\bdrop_pos\u0018\b \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HitTreeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_HitTreeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HitTreeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor, new String[] { "TreeType", "TreePos", "DropPos" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HitTreeNotify extends GeneratedMessageV3 implements HitTreeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TREE_TYPE_FIELD_NUMBER = 11;
        private int treeType_;
        public static final int TREE_POS_FIELD_NUMBER = 2;
        private VectorOuterClass.Vector treePos_;
        public static final int DROP_POS_FIELD_NUMBER = 8;
        private VectorOuterClass.Vector dropPos_;
        private byte memoizedIsInitialized;
        private static final HitTreeNotify DEFAULT_INSTANCE;
        private static final Parser<HitTreeNotify> PARSER;
        
        private HitTreeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HitTreeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HitTreeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HitTreeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.treePos_ != null) {
                                subBuilder = this.treePos_.toBuilder();
                            }
                            this.treePos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.treePos_);
                                this.treePos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 66: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.dropPos_ != null) {
                                subBuilder = this.dropPos_.toBuilder();
                            }
                            this.dropPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.dropPos_);
                                this.dropPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 88: {
                            this.treeType_ = input.readUInt32();
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
            return HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HitTreeNotifyOuterClass.internal_static_HitTreeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HitTreeNotify.class, Builder.class);
        }
        
        @Override
        public int getTreeType() {
            return this.treeType_;
        }
        
        @Override
        public boolean hasTreePos() {
            return this.treePos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getTreePos() {
            return (this.treePos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.treePos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getTreePosOrBuilder() {
            return this.getTreePos();
        }
        
        @Override
        public boolean hasDropPos() {
            return this.dropPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getDropPos() {
            return (this.dropPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.dropPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getDropPosOrBuilder() {
            return this.getDropPos();
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
            if (this.treePos_ != null) {
                output.writeMessage(2, this.getTreePos());
            }
            if (this.dropPos_ != null) {
                output.writeMessage(8, this.getDropPos());
            }
            if (this.treeType_ != 0) {
                output.writeUInt32(11, this.treeType_);
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
            if (this.treePos_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getTreePos());
            }
            if (this.dropPos_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getDropPos());
            }
            if (this.treeType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.treeType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HitTreeNotify)) {
                return super.equals(obj);
            }
            final HitTreeNotify other = (HitTreeNotify)obj;
            return this.getTreeType() == other.getTreeType() && this.hasTreePos() == other.hasTreePos() && (!this.hasTreePos() || this.getTreePos().equals(other.getTreePos())) && this.hasDropPos() == other.hasDropPos() && (!this.hasDropPos() || this.getDropPos().equals(other.getDropPos())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getTreeType();
            if (this.hasTreePos()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getTreePos().hashCode();
            }
            if (this.hasDropPos()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getDropPos().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HitTreeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data);
        }
        
        public static HitTreeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HitTreeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data);
        }
        
        public static HitTreeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HitTreeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data);
        }
        
        public static HitTreeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HitTreeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HitTreeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HitTreeNotify.PARSER, input);
        }
        
        public static HitTreeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HitTreeNotify.PARSER, input, extensionRegistry);
        }
        
        public static HitTreeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HitTreeNotify.PARSER, input);
        }
        
        public static HitTreeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HitTreeNotify.PARSER, input, extensionRegistry);
        }
        
        public static HitTreeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HitTreeNotify.PARSER, input);
        }
        
        public static HitTreeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HitTreeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HitTreeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HitTreeNotify prototype) {
            return HitTreeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HitTreeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HitTreeNotify getDefaultInstance() {
            return HitTreeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<HitTreeNotify> parser() {
            return HitTreeNotify.PARSER;
        }
        
        @Override
        public Parser<HitTreeNotify> getParserForType() {
            return HitTreeNotify.PARSER;
        }
        
        @Override
        public HitTreeNotify getDefaultInstanceForType() {
            return HitTreeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HitTreeNotify();
            PARSER = new AbstractParser<HitTreeNotify>() {
                @Override
                public HitTreeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HitTreeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HitTreeNotifyOrBuilder
        {
            private int treeType_;
            private VectorOuterClass.Vector treePos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> treePosBuilder_;
            private VectorOuterClass.Vector dropPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> dropPosBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HitTreeNotifyOuterClass.internal_static_HitTreeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(HitTreeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HitTreeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.treeType_ = 0;
                if (this.treePosBuilder_ == null) {
                    this.treePos_ = null;
                }
                else {
                    this.treePos_ = null;
                    this.treePosBuilder_ = null;
                }
                if (this.dropPosBuilder_ == null) {
                    this.dropPos_ = null;
                }
                else {
                    this.dropPos_ = null;
                    this.dropPosBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
            }
            
            @Override
            public HitTreeNotify getDefaultInstanceForType() {
                return HitTreeNotify.getDefaultInstance();
            }
            
            @Override
            public HitTreeNotify build() {
                final HitTreeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HitTreeNotify buildPartial() {
                final HitTreeNotify result = new HitTreeNotify(this);
                result.treeType_ = this.treeType_;
                if (this.treePosBuilder_ == null) {
                    result.treePos_ = this.treePos_;
                }
                else {
                    result.treePos_ = this.treePosBuilder_.build();
                }
                if (this.dropPosBuilder_ == null) {
                    result.dropPos_ = this.dropPos_;
                }
                else {
                    result.dropPos_ = this.dropPosBuilder_.build();
                }
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
                if (other instanceof HitTreeNotify) {
                    return this.mergeFrom((HitTreeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HitTreeNotify other) {
                if (other == HitTreeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getTreeType() != 0) {
                    this.setTreeType(other.getTreeType());
                }
                if (other.hasTreePos()) {
                    this.mergeTreePos(other.getTreePos());
                }
                if (other.hasDropPos()) {
                    this.mergeDropPos(other.getDropPos());
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
                HitTreeNotify parsedMessage = null;
                try {
                    parsedMessage = HitTreeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HitTreeNotify)e.getUnfinishedMessage();
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
            public int getTreeType() {
                return this.treeType_;
            }
            
            public Builder setTreeType(final int value) {
                this.treeType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTreeType() {
                this.treeType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasTreePos() {
                return this.treePosBuilder_ != null || this.treePos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getTreePos() {
                if (this.treePosBuilder_ == null) {
                    return (this.treePos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.treePos_;
                }
                return this.treePosBuilder_.getMessage();
            }
            
            public Builder setTreePos(final VectorOuterClass.Vector value) {
                if (this.treePosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.treePos_ = value;
                    this.onChanged();
                }
                else {
                    this.treePosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTreePos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.treePosBuilder_ == null) {
                    this.treePos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.treePosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTreePos(final VectorOuterClass.Vector value) {
                if (this.treePosBuilder_ == null) {
                    if (this.treePos_ != null) {
                        this.treePos_ = VectorOuterClass.Vector.newBuilder(this.treePos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.treePos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.treePosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTreePos() {
                if (this.treePosBuilder_ == null) {
                    this.treePos_ = null;
                    this.onChanged();
                }
                else {
                    this.treePos_ = null;
                    this.treePosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getTreePosBuilder() {
                this.onChanged();
                return this.getTreePosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getTreePosOrBuilder() {
                if (this.treePosBuilder_ != null) {
                    return this.treePosBuilder_.getMessageOrBuilder();
                }
                return (this.treePos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.treePos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getTreePosFieldBuilder() {
                if (this.treePosBuilder_ == null) {
                    this.treePosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getTreePos(), this.getParentForChildren(), this.isClean());
                    this.treePos_ = null;
                }
                return this.treePosBuilder_;
            }
            
            @Override
            public boolean hasDropPos() {
                return this.dropPosBuilder_ != null || this.dropPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getDropPos() {
                if (this.dropPosBuilder_ == null) {
                    return (this.dropPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.dropPos_;
                }
                return this.dropPosBuilder_.getMessage();
            }
            
            public Builder setDropPos(final VectorOuterClass.Vector value) {
                if (this.dropPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.dropPos_ = value;
                    this.onChanged();
                }
                else {
                    this.dropPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDropPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.dropPosBuilder_ == null) {
                    this.dropPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.dropPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDropPos(final VectorOuterClass.Vector value) {
                if (this.dropPosBuilder_ == null) {
                    if (this.dropPos_ != null) {
                        this.dropPos_ = VectorOuterClass.Vector.newBuilder(this.dropPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.dropPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.dropPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDropPos() {
                if (this.dropPosBuilder_ == null) {
                    this.dropPos_ = null;
                    this.onChanged();
                }
                else {
                    this.dropPos_ = null;
                    this.dropPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getDropPosBuilder() {
                this.onChanged();
                return this.getDropPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getDropPosOrBuilder() {
                if (this.dropPosBuilder_ != null) {
                    return this.dropPosBuilder_.getMessageOrBuilder();
                }
                return (this.dropPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.dropPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getDropPosFieldBuilder() {
                if (this.dropPosBuilder_ == null) {
                    this.dropPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getDropPos(), this.getParentForChildren(), this.isClean());
                    this.dropPos_ = null;
                }
                return this.dropPosBuilder_;
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
    
    public interface HitTreeNotifyOrBuilder extends MessageOrBuilder
    {
        int getTreeType();
        
        boolean hasTreePos();
        
        VectorOuterClass.Vector getTreePos();
        
        VectorOuterClass.VectorOrBuilder getTreePosOrBuilder();
        
        boolean hasDropPos();
        
        VectorOuterClass.Vector getDropPos();
        
        VectorOuterClass.VectorOrBuilder getDropPosOrBuilder();
    }
}
