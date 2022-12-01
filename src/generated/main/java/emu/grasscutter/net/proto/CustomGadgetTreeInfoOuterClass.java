// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CustomGadgetTreeInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_CustomGadgetTreeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CustomGadgetTreeInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CustomGadgetTreeInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CustomGadgetTreeInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCustomGadgetTreeInfo.proto\u001a\u001aCustomCommonNodeInfo.proto\"@\n\u0014CustomGadgetTreeInfo\u0012(\n\tnode_list\u0018\u0001 \u0003(\u000b2\u0015.CustomCommonNodeInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CustomGadgetTreeInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CustomCommonNodeInfoOuterClass.getDescriptor() });
        internal_static_CustomGadgetTreeInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CustomGadgetTreeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor, new String[] { "NodeList" });
        CustomCommonNodeInfoOuterClass.getDescriptor();
    }
    
    public static final class CustomGadgetTreeInfo extends GeneratedMessageV3 implements CustomGadgetTreeInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NODE_LIST_FIELD_NUMBER = 1;
        private List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> nodeList_;
        private byte memoizedIsInitialized;
        private static final CustomGadgetTreeInfo DEFAULT_INSTANCE;
        private static final Parser<CustomGadgetTreeInfo> PARSER;
        
        private CustomGadgetTreeInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CustomGadgetTreeInfo() {
            this.memoizedIsInitialized = -1;
            this.nodeList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CustomGadgetTreeInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CustomGadgetTreeInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.nodeList_ = new ArrayList<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.nodeList_.add(input.readMessage(CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.parser(), extensionRegistry));
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
                    this.nodeList_ = Collections.unmodifiableList((List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>)this.nodeList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomGadgetTreeInfo.class, Builder.class);
        }
        
        @Override
        public List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getNodeListList() {
            return this.nodeList_;
        }
        
        @Override
        public List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> getNodeListOrBuilderList() {
            return this.nodeList_;
        }
        
        @Override
        public int getNodeListCount() {
            return this.nodeList_.size();
        }
        
        @Override
        public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(final int index) {
            return this.nodeList_.get(index);
        }
        
        @Override
        public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(final int index) {
            return this.nodeList_.get(index);
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
            for (int i = 0; i < this.nodeList_.size(); ++i) {
                output.writeMessage(1, this.nodeList_.get(i));
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
            for (int i = 0; i < this.nodeList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.nodeList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomGadgetTreeInfo)) {
                return super.equals(obj);
            }
            final CustomGadgetTreeInfo other = (CustomGadgetTreeInfo)obj;
            return this.getNodeListList().equals(other.getNodeListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getNodeListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getNodeListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CustomGadgetTreeInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomGadgetTreeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomGadgetTreeInfo.PARSER, input);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomGadgetTreeInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomGadgetTreeInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomGadgetTreeInfo.PARSER, input);
        }
        
        public static CustomGadgetTreeInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomGadgetTreeInfo.PARSER, input, extensionRegistry);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomGadgetTreeInfo.PARSER, input);
        }
        
        public static CustomGadgetTreeInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomGadgetTreeInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CustomGadgetTreeInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CustomGadgetTreeInfo prototype) {
            return CustomGadgetTreeInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CustomGadgetTreeInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CustomGadgetTreeInfo getDefaultInstance() {
            return CustomGadgetTreeInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<CustomGadgetTreeInfo> parser() {
            return CustomGadgetTreeInfo.PARSER;
        }
        
        @Override
        public Parser<CustomGadgetTreeInfo> getParserForType() {
            return CustomGadgetTreeInfo.PARSER;
        }
        
        @Override
        public CustomGadgetTreeInfo getDefaultInstanceForType() {
            return CustomGadgetTreeInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CustomGadgetTreeInfo();
            PARSER = new AbstractParser<CustomGadgetTreeInfo>() {
                @Override
                public CustomGadgetTreeInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CustomGadgetTreeInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomGadgetTreeInfoOrBuilder
        {
            private int bitField0_;
            private List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> nodeList_;
            private RepeatedFieldBuilderV3<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> nodeListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomGadgetTreeInfo.class, Builder.class);
            }
            
            private Builder() {
                this.nodeList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.nodeList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CustomGadgetTreeInfo.alwaysUseFieldBuilders) {
                    this.getNodeListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.nodeListBuilder_ == null) {
                    this.nodeList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.nodeListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
            }
            
            @Override
            public CustomGadgetTreeInfo getDefaultInstanceForType() {
                return CustomGadgetTreeInfo.getDefaultInstance();
            }
            
            @Override
            public CustomGadgetTreeInfo build() {
                final CustomGadgetTreeInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CustomGadgetTreeInfo buildPartial() {
                final CustomGadgetTreeInfo result = new CustomGadgetTreeInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.nodeListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.nodeList_ = Collections.unmodifiableList((List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>)this.nodeList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.nodeList_ = this.nodeList_;
                }
                else {
                    result.nodeList_ = this.nodeListBuilder_.build();
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
                if (other instanceof CustomGadgetTreeInfo) {
                    return this.mergeFrom((CustomGadgetTreeInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CustomGadgetTreeInfo other) {
                if (other == CustomGadgetTreeInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.nodeListBuilder_ == null) {
                    if (!other.nodeList_.isEmpty()) {
                        if (this.nodeList_.isEmpty()) {
                            this.nodeList_ = other.nodeList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureNodeListIsMutable();
                            this.nodeList_.addAll(other.nodeList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.nodeList_.isEmpty()) {
                    if (this.nodeListBuilder_.isEmpty()) {
                        this.nodeListBuilder_.dispose();
                        this.nodeListBuilder_ = null;
                        this.nodeList_ = other.nodeList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.nodeListBuilder_ = (CustomGadgetTreeInfo.alwaysUseFieldBuilders ? this.getNodeListFieldBuilder() : null);
                    }
                    else {
                        this.nodeListBuilder_.addAllMessages(other.nodeList_);
                    }
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
                CustomGadgetTreeInfo parsedMessage = null;
                try {
                    parsedMessage = CustomGadgetTreeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CustomGadgetTreeInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureNodeListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.nodeList_ = new ArrayList<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>(this.nodeList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getNodeListList() {
                if (this.nodeListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>)this.nodeList_);
                }
                return this.nodeListBuilder_.getMessageList();
            }
            
            @Override
            public int getNodeListCount() {
                if (this.nodeListBuilder_ == null) {
                    return this.nodeList_.size();
                }
                return this.nodeListBuilder_.getCount();
            }
            
            @Override
            public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(final int index) {
                if (this.nodeListBuilder_ == null) {
                    return this.nodeList_.get(index);
                }
                return this.nodeListBuilder_.getMessage(index);
            }
            
            public Builder setNodeList(final int index, final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
                if (this.nodeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNodeListIsMutable();
                    this.nodeList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setNodeList(final int index, final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
                if (this.nodeListBuilder_ == null) {
                    this.ensureNodeListIsMutable();
                    this.nodeList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addNodeList(final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
                if (this.nodeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNodeListIsMutable();
                    this.nodeList_.add(value);
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addNodeList(final int index, final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
                if (this.nodeListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNodeListIsMutable();
                    this.nodeList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addNodeList(final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
                if (this.nodeListBuilder_ == null) {
                    this.ensureNodeListIsMutable();
                    this.nodeList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addNodeList(final int index, final CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
                if (this.nodeListBuilder_ == null) {
                    this.ensureNodeListIsMutable();
                    this.nodeList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllNodeList(final Iterable<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> values) {
                if (this.nodeListBuilder_ == null) {
                    this.ensureNodeListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.nodeList_);
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearNodeList() {
                if (this.nodeListBuilder_ == null) {
                    this.nodeList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeNodeList(final int index) {
                if (this.nodeListBuilder_ == null) {
                    this.ensureNodeListIsMutable();
                    this.nodeList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.nodeListBuilder_.remove(index);
                }
                return this;
            }
            
            public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder getNodeListBuilder(final int index) {
                return this.getNodeListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(final int index) {
                if (this.nodeListBuilder_ == null) {
                    return this.nodeList_.get(index);
                }
                return this.nodeListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> getNodeListOrBuilderList() {
                if (this.nodeListBuilder_ != null) {
                    return this.nodeListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>)this.nodeList_);
            }
            
            public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addNodeListBuilder() {
                return this.getNodeListFieldBuilder().addBuilder(CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
            }
            
            public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addNodeListBuilder(final int index) {
                return this.getNodeListFieldBuilder().addBuilder(index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
            }
            
            public List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder> getNodeListBuilderList() {
                return this.getNodeListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> getNodeListFieldBuilder() {
                if (this.nodeListBuilder_ == null) {
                    this.nodeListBuilder_ = new RepeatedFieldBuilderV3<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>(this.nodeList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.nodeList_ = null;
                }
                return this.nodeListBuilder_;
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
    
    public interface CustomGadgetTreeInfoOrBuilder extends MessageOrBuilder
    {
        List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getNodeListList();
        
        CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(final int p0);
        
        int getNodeListCount();
        
        List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> getNodeListOrBuilderList();
        
        CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(final int p0);
    }
}
