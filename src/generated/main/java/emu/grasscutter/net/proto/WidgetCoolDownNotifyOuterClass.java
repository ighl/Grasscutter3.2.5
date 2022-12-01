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

public final class WidgetCoolDownNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetCoolDownNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetCoolDownNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetCoolDownNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetCoolDownNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aWidgetCoolDownNotify.proto\u001a\u0018WidgetCoolDownData.proto\"\u0087\u0001\n\u0014WidgetCoolDownNotify\u00127\n\u001anormal_cool_down_data_list\u0018\u0001 \u0003(\u000b2\u0013.WidgetCoolDownData\u00126\n\u0019group_cool_down_data_list\u0018\f \u0003(\u000b2\u0013.WidgetCoolDownDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetCoolDownNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetCoolDownDataOuterClass.getDescriptor() });
        internal_static_WidgetCoolDownNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetCoolDownNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_descriptor, new String[] { "NormalCoolDownDataList", "GroupCoolDownDataList" });
        WidgetCoolDownDataOuterClass.getDescriptor();
    }
    
    public static final class WidgetCoolDownNotify extends GeneratedMessageV3 implements WidgetCoolDownNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NORMAL_COOL_DOWN_DATA_LIST_FIELD_NUMBER = 1;
        private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> normalCoolDownDataList_;
        public static final int GROUP_COOL_DOWN_DATA_LIST_FIELD_NUMBER = 12;
        private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> groupCoolDownDataList_;
        private byte memoizedIsInitialized;
        private static final WidgetCoolDownNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetCoolDownNotify> PARSER;
        
        private WidgetCoolDownNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetCoolDownNotify() {
            this.memoizedIsInitialized = -1;
            this.normalCoolDownDataList_ = Collections.emptyList();
            this.groupCoolDownDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetCoolDownNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetCoolDownNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.normalCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.normalCoolDownDataList_.add(input.readMessage(WidgetCoolDownDataOuterClass.WidgetCoolDownData.parser(), extensionRegistry));
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.groupCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.groupCoolDownDataList_.add(input.readMessage(WidgetCoolDownDataOuterClass.WidgetCoolDownData.parser(), extensionRegistry));
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
                    this.normalCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.groupCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.groupCoolDownDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCoolDownNotify.class, Builder.class);
        }
        
        @Override
        public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList() {
            return this.normalCoolDownDataList_;
        }
        
        @Override
        public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList() {
            return this.normalCoolDownDataList_;
        }
        
        @Override
        public int getNormalCoolDownDataListCount() {
            return this.normalCoolDownDataList_.size();
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int index) {
            return this.normalCoolDownDataList_.get(index);
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int index) {
            return this.normalCoolDownDataList_.get(index);
        }
        
        @Override
        public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getGroupCoolDownDataListList() {
            return this.groupCoolDownDataList_;
        }
        
        @Override
        public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getGroupCoolDownDataListOrBuilderList() {
            return this.groupCoolDownDataList_;
        }
        
        @Override
        public int getGroupCoolDownDataListCount() {
            return this.groupCoolDownDataList_.size();
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownData getGroupCoolDownDataList(final int index) {
            return this.groupCoolDownDataList_.get(index);
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getGroupCoolDownDataListOrBuilder(final int index) {
            return this.groupCoolDownDataList_.get(index);
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
            for (int i = 0; i < this.normalCoolDownDataList_.size(); ++i) {
                output.writeMessage(1, this.normalCoolDownDataList_.get(i));
            }
            for (int i = 0; i < this.groupCoolDownDataList_.size(); ++i) {
                output.writeMessage(12, this.groupCoolDownDataList_.get(i));
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
            for (int i = 0; i < this.normalCoolDownDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.normalCoolDownDataList_.get(i));
            }
            for (int i = 0; i < this.groupCoolDownDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.groupCoolDownDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetCoolDownNotify)) {
                return super.equals(obj);
            }
            final WidgetCoolDownNotify other = (WidgetCoolDownNotify)obj;
            return this.getNormalCoolDownDataListList().equals(other.getNormalCoolDownDataListList()) && this.getGroupCoolDownDataListList().equals(other.getGroupCoolDownDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getNormalCoolDownDataListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getNormalCoolDownDataListList().hashCode();
            }
            if (this.getGroupCoolDownDataListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getGroupCoolDownDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetCoolDownNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownNotify.PARSER, input);
        }
        
        public static WidgetCoolDownNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCoolDownNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCoolDownNotify.PARSER, input);
        }
        
        public static WidgetCoolDownNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCoolDownNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCoolDownNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownNotify.PARSER, input);
        }
        
        public static WidgetCoolDownNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetCoolDownNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetCoolDownNotify prototype) {
            return WidgetCoolDownNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetCoolDownNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetCoolDownNotify getDefaultInstance() {
            return WidgetCoolDownNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetCoolDownNotify> parser() {
            return WidgetCoolDownNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetCoolDownNotify> getParserForType() {
            return WidgetCoolDownNotify.PARSER;
        }
        
        @Override
        public WidgetCoolDownNotify getDefaultInstanceForType() {
            return WidgetCoolDownNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetCoolDownNotify();
            PARSER = new AbstractParser<WidgetCoolDownNotify>() {
                @Override
                public WidgetCoolDownNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetCoolDownNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetCoolDownNotifyOrBuilder
        {
            private int bitField0_;
            private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> normalCoolDownDataList_;
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> normalCoolDownDataListBuilder_;
            private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> groupCoolDownDataList_;
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> groupCoolDownDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCoolDownNotify.class, Builder.class);
            }
            
            private Builder() {
                this.normalCoolDownDataList_ = Collections.emptyList();
                this.groupCoolDownDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.normalCoolDownDataList_ = Collections.emptyList();
                this.groupCoolDownDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetCoolDownNotify.alwaysUseFieldBuilders) {
                    this.getNormalCoolDownDataListFieldBuilder();
                    this.getGroupCoolDownDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.normalCoolDownDataListBuilder_.clear();
                }
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.groupCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.groupCoolDownDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetCoolDownNotifyOuterClass.internal_static_WidgetCoolDownNotify_descriptor;
            }
            
            @Override
            public WidgetCoolDownNotify getDefaultInstanceForType() {
                return WidgetCoolDownNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetCoolDownNotify build() {
                final WidgetCoolDownNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetCoolDownNotify buildPartial() {
                final WidgetCoolDownNotify result = new WidgetCoolDownNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.normalCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.normalCoolDownDataList_ = this.normalCoolDownDataList_;
                }
                else {
                    result.normalCoolDownDataList_ = this.normalCoolDownDataListBuilder_.build();
                }
                if (this.groupCoolDownDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.groupCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.groupCoolDownDataList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.groupCoolDownDataList_ = this.groupCoolDownDataList_;
                }
                else {
                    result.groupCoolDownDataList_ = this.groupCoolDownDataListBuilder_.build();
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
                if (other instanceof WidgetCoolDownNotify) {
                    return this.mergeFrom((WidgetCoolDownNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetCoolDownNotify other) {
                if (other == WidgetCoolDownNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (!other.normalCoolDownDataList_.isEmpty()) {
                        if (this.normalCoolDownDataList_.isEmpty()) {
                            this.normalCoolDownDataList_ = other.normalCoolDownDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureNormalCoolDownDataListIsMutable();
                            this.normalCoolDownDataList_.addAll(other.normalCoolDownDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.normalCoolDownDataList_.isEmpty()) {
                    if (this.normalCoolDownDataListBuilder_.isEmpty()) {
                        this.normalCoolDownDataListBuilder_.dispose();
                        this.normalCoolDownDataListBuilder_ = null;
                        this.normalCoolDownDataList_ = other.normalCoolDownDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.normalCoolDownDataListBuilder_ = (WidgetCoolDownNotify.alwaysUseFieldBuilders ? this.getNormalCoolDownDataListFieldBuilder() : null);
                    }
                    else {
                        this.normalCoolDownDataListBuilder_.addAllMessages(other.normalCoolDownDataList_);
                    }
                }
                if (this.groupCoolDownDataListBuilder_ == null) {
                    if (!other.groupCoolDownDataList_.isEmpty()) {
                        if (this.groupCoolDownDataList_.isEmpty()) {
                            this.groupCoolDownDataList_ = other.groupCoolDownDataList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureGroupCoolDownDataListIsMutable();
                            this.groupCoolDownDataList_.addAll(other.groupCoolDownDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.groupCoolDownDataList_.isEmpty()) {
                    if (this.groupCoolDownDataListBuilder_.isEmpty()) {
                        this.groupCoolDownDataListBuilder_.dispose();
                        this.groupCoolDownDataListBuilder_ = null;
                        this.groupCoolDownDataList_ = other.groupCoolDownDataList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.groupCoolDownDataListBuilder_ = (WidgetCoolDownNotify.alwaysUseFieldBuilders ? this.getGroupCoolDownDataListFieldBuilder() : null);
                    }
                    else {
                        this.groupCoolDownDataListBuilder_.addAllMessages(other.groupCoolDownDataList_);
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
                WidgetCoolDownNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetCoolDownNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetCoolDownNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureNormalCoolDownDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.normalCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>(this.normalCoolDownDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                }
                return this.normalCoolDownDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getNormalCoolDownDataListCount() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.size();
                }
                return this.normalCoolDownDataListBuilder_.getCount();
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.get(index);
                }
                return this.normalCoolDownDataListBuilder_.getMessage(index);
            }
            
            public Builder setNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllNormalCoolDownDataList(final Iterable<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData> values) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.normalCoolDownDataList_);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearNormalCoolDownDataList() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeNormalCoolDownDataList(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getNormalCoolDownDataListBuilder(final int index) {
                return this.getNormalCoolDownDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.get(index);
                }
                return this.normalCoolDownDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList() {
                if (this.normalCoolDownDataListBuilder_ != null) {
                    return this.normalCoolDownDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>)this.normalCoolDownDataList_);
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addNormalCoolDownDataListBuilder() {
                return this.getNormalCoolDownDataListFieldBuilder().addBuilder(WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addNormalCoolDownDataListBuilder(final int index) {
                return this.getNormalCoolDownDataListFieldBuilder().addBuilder(index, WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder> getNormalCoolDownDataListBuilderList() {
                return this.getNormalCoolDownDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListFieldBuilder() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataListBuilder_ = new RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(this.normalCoolDownDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.normalCoolDownDataList_ = null;
                }
                return this.normalCoolDownDataListBuilder_;
            }
            
            private void ensureGroupCoolDownDataListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.groupCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>(this.groupCoolDownDataList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getGroupCoolDownDataListList() {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.groupCoolDownDataList_);
                }
                return this.groupCoolDownDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getGroupCoolDownDataListCount() {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    return this.groupCoolDownDataList_.size();
                }
                return this.groupCoolDownDataListBuilder_.getCount();
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData getGroupCoolDownDataList(final int index) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    return this.groupCoolDownDataList_.get(index);
                }
                return this.groupCoolDownDataListBuilder_.getMessage(index);
            }
            
            public Builder setGroupCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setGroupCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addGroupCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addGroupCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addGroupCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addGroupCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllGroupCoolDownDataList(final Iterable<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData> values) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.ensureGroupCoolDownDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.groupCoolDownDataList_);
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearGroupCoolDownDataList() {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.groupCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeGroupCoolDownDataList(final int index) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.ensureGroupCoolDownDataListIsMutable();
                    this.groupCoolDownDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.groupCoolDownDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getGroupCoolDownDataListBuilder(final int index) {
                return this.getGroupCoolDownDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getGroupCoolDownDataListOrBuilder(final int index) {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    return this.groupCoolDownDataList_.get(index);
                }
                return this.groupCoolDownDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getGroupCoolDownDataListOrBuilderList() {
                if (this.groupCoolDownDataListBuilder_ != null) {
                    return this.groupCoolDownDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>)this.groupCoolDownDataList_);
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addGroupCoolDownDataListBuilder() {
                return this.getGroupCoolDownDataListFieldBuilder().addBuilder(WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addGroupCoolDownDataListBuilder(final int index) {
                return this.getGroupCoolDownDataListFieldBuilder().addBuilder(index, WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder> getGroupCoolDownDataListBuilderList() {
                return this.getGroupCoolDownDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getGroupCoolDownDataListFieldBuilder() {
                if (this.groupCoolDownDataListBuilder_ == null) {
                    this.groupCoolDownDataListBuilder_ = new RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(this.groupCoolDownDataList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.groupCoolDownDataList_ = null;
                }
                return this.groupCoolDownDataListBuilder_;
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
    
    public interface WidgetCoolDownNotifyOrBuilder extends MessageOrBuilder
    {
        List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int p0);
        
        int getNormalCoolDownDataListCount();
        
        List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int p0);
        
        List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getGroupCoolDownDataListList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownData getGroupCoolDownDataList(final int p0);
        
        int getGroupCoolDownDataListCount();
        
        List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getGroupCoolDownDataListOrBuilderList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getGroupCoolDownDataListOrBuilder(final int p0);
    }
}
