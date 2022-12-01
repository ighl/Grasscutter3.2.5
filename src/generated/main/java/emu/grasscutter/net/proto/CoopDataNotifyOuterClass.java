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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CoopDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CoopDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014CoopDataNotify.proto\u001a\u0011CoopChapter.proto\"\u0083\u0001\n\u000eCoopDataNotify\u0012\"\n\fchapter_list\u0018\u000f \u0003(\u000b2\f.CoopChapter\u0012\u001b\n\u0013viewed_chapter_list\u0018\u0007 \u0003(\r\u0012\u0018\n\u0010is_have_progress\u0018\n \u0001(\b\u0012\u0016\n\u000ecur_coop_point\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CoopChapterOuterClass.getDescriptor() });
        internal_static_CoopDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CoopDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopDataNotifyOuterClass.internal_static_CoopDataNotify_descriptor, new String[] { "ChapterList", "ViewedChapterList", "IsHaveProgress", "CurCoopPoint" });
        CoopChapterOuterClass.getDescriptor();
    }
    
    public static final class CoopDataNotify extends GeneratedMessageV3 implements CoopDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHAPTER_LIST_FIELD_NUMBER = 15;
        private List<CoopChapterOuterClass.CoopChapter> chapterList_;
        public static final int VIEWED_CHAPTER_LIST_FIELD_NUMBER = 7;
        private Internal.IntList viewedChapterList_;
        private int viewedChapterListMemoizedSerializedSize;
        public static final int IS_HAVE_PROGRESS_FIELD_NUMBER = 10;
        private boolean isHaveProgress_;
        public static final int CUR_COOP_POINT_FIELD_NUMBER = 5;
        private int curCoopPoint_;
        private byte memoizedIsInitialized;
        private static final CoopDataNotify DEFAULT_INSTANCE;
        private static final Parser<CoopDataNotify> PARSER;
        
        private CoopDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.viewedChapterListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CoopDataNotify() {
            this.viewedChapterListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.chapterList_ = Collections.emptyList();
            this.viewedChapterList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CoopDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CoopDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.curCoopPoint_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.viewedChapterList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.viewedChapterList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 58: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.viewedChapterList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.viewedChapterList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 80: {
                            this.isHaveProgress_ = input.readBool();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.chapterList_ = new ArrayList<CoopChapterOuterClass.CoopChapter>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.chapterList_.add(input.readMessage(CoopChapterOuterClass.CoopChapter.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.viewedChapterList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.chapterList_ = Collections.unmodifiableList((List<? extends CoopChapterOuterClass.CoopChapter>)this.chapterList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CoopDataNotifyOuterClass.internal_static_CoopDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CoopDataNotifyOuterClass.internal_static_CoopDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopDataNotify.class, Builder.class);
        }
        
        @Override
        public List<CoopChapterOuterClass.CoopChapter> getChapterListList() {
            return this.chapterList_;
        }
        
        @Override
        public List<? extends CoopChapterOuterClass.CoopChapterOrBuilder> getChapterListOrBuilderList() {
            return this.chapterList_;
        }
        
        @Override
        public int getChapterListCount() {
            return this.chapterList_.size();
        }
        
        @Override
        public CoopChapterOuterClass.CoopChapter getChapterList(final int index) {
            return this.chapterList_.get(index);
        }
        
        @Override
        public CoopChapterOuterClass.CoopChapterOrBuilder getChapterListOrBuilder(final int index) {
            return this.chapterList_.get(index);
        }
        
        @Override
        public List<Integer> getViewedChapterListList() {
            return this.viewedChapterList_;
        }
        
        @Override
        public int getViewedChapterListCount() {
            return this.viewedChapterList_.size();
        }
        
        @Override
        public int getViewedChapterList(final int index) {
            return this.viewedChapterList_.getInt(index);
        }
        
        @Override
        public boolean getIsHaveProgress() {
            return this.isHaveProgress_;
        }
        
        @Override
        public int getCurCoopPoint() {
            return this.curCoopPoint_;
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
            if (this.curCoopPoint_ != 0) {
                output.writeUInt32(5, this.curCoopPoint_);
            }
            if (this.getViewedChapterListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(this.viewedChapterListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.viewedChapterList_.size(); ++i) {
                output.writeUInt32NoTag(this.viewedChapterList_.getInt(i));
            }
            if (this.isHaveProgress_) {
                output.writeBool(10, this.isHaveProgress_);
            }
            for (int i = 0; i < this.chapterList_.size(); ++i) {
                output.writeMessage(15, this.chapterList_.get(i));
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
            if (this.curCoopPoint_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.curCoopPoint_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.viewedChapterList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.viewedChapterList_.getInt(i));
            }
            size += dataSize;
            if (!this.getViewedChapterListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.viewedChapterListMemoizedSerializedSize = dataSize;
            if (this.isHaveProgress_) {
                size += CodedOutputStream.computeBoolSize(10, this.isHaveProgress_);
            }
            for (int j = 0; j < this.chapterList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(15, this.chapterList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoopDataNotify)) {
                return super.equals(obj);
            }
            final CoopDataNotify other = (CoopDataNotify)obj;
            return this.getChapterListList().equals(other.getChapterListList()) && this.getViewedChapterListList().equals(other.getViewedChapterListList()) && this.getIsHaveProgress() == other.getIsHaveProgress() && this.getCurCoopPoint() == other.getCurCoopPoint() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getChapterListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getChapterListList().hashCode();
            }
            if (this.getViewedChapterListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getViewedChapterListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsHaveProgress());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getCurCoopPoint();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CoopDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data);
        }
        
        public static CoopDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data);
        }
        
        public static CoopDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data);
        }
        
        public static CoopDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopDataNotify.PARSER, input);
        }
        
        public static CoopDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CoopDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopDataNotify.PARSER, input);
        }
        
        public static CoopDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CoopDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopDataNotify.PARSER, input);
        }
        
        public static CoopDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CoopDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CoopDataNotify prototype) {
            return CoopDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CoopDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CoopDataNotify getDefaultInstance() {
            return CoopDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CoopDataNotify> parser() {
            return CoopDataNotify.PARSER;
        }
        
        @Override
        public Parser<CoopDataNotify> getParserForType() {
            return CoopDataNotify.PARSER;
        }
        
        @Override
        public CoopDataNotify getDefaultInstanceForType() {
            return CoopDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CoopDataNotify();
            PARSER = new AbstractParser<CoopDataNotify>() {
                @Override
                public CoopDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CoopDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoopDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<CoopChapterOuterClass.CoopChapter> chapterList_;
            private RepeatedFieldBuilderV3<CoopChapterOuterClass.CoopChapter, CoopChapterOuterClass.CoopChapter.Builder, CoopChapterOuterClass.CoopChapterOrBuilder> chapterListBuilder_;
            private Internal.IntList viewedChapterList_;
            private boolean isHaveProgress_;
            private int curCoopPoint_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CoopDataNotifyOuterClass.internal_static_CoopDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CoopDataNotifyOuterClass.internal_static_CoopDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.chapterList_ = Collections.emptyList();
                this.viewedChapterList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.chapterList_ = Collections.emptyList();
                this.viewedChapterList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CoopDataNotify.alwaysUseFieldBuilders) {
                    this.getChapterListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.chapterListBuilder_ == null) {
                    this.chapterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.chapterListBuilder_.clear();
                }
                this.viewedChapterList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.isHaveProgress_ = false;
                this.curCoopPoint_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CoopDataNotifyOuterClass.internal_static_CoopDataNotify_descriptor;
            }
            
            @Override
            public CoopDataNotify getDefaultInstanceForType() {
                return CoopDataNotify.getDefaultInstance();
            }
            
            @Override
            public CoopDataNotify build() {
                final CoopDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CoopDataNotify buildPartial() {
                final CoopDataNotify result = new CoopDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.chapterListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.chapterList_ = Collections.unmodifiableList((List<? extends CoopChapterOuterClass.CoopChapter>)this.chapterList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.chapterList_ = this.chapterList_;
                }
                else {
                    result.chapterList_ = this.chapterListBuilder_.build();
                }
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.viewedChapterList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.viewedChapterList_ = this.viewedChapterList_;
                result.isHaveProgress_ = this.isHaveProgress_;
                result.curCoopPoint_ = this.curCoopPoint_;
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
                if (other instanceof CoopDataNotify) {
                    return this.mergeFrom((CoopDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CoopDataNotify other) {
                if (other == CoopDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.chapterListBuilder_ == null) {
                    if (!other.chapterList_.isEmpty()) {
                        if (this.chapterList_.isEmpty()) {
                            this.chapterList_ = other.chapterList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureChapterListIsMutable();
                            this.chapterList_.addAll(other.chapterList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.chapterList_.isEmpty()) {
                    if (this.chapterListBuilder_.isEmpty()) {
                        this.chapterListBuilder_.dispose();
                        this.chapterListBuilder_ = null;
                        this.chapterList_ = other.chapterList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.chapterListBuilder_ = (CoopDataNotify.alwaysUseFieldBuilders ? this.getChapterListFieldBuilder() : null);
                    }
                    else {
                        this.chapterListBuilder_.addAllMessages(other.chapterList_);
                    }
                }
                if (!other.viewedChapterList_.isEmpty()) {
                    if (this.viewedChapterList_.isEmpty()) {
                        this.viewedChapterList_ = other.viewedChapterList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureViewedChapterListIsMutable();
                        this.viewedChapterList_.addAll(other.viewedChapterList_);
                    }
                    this.onChanged();
                }
                if (other.getIsHaveProgress()) {
                    this.setIsHaveProgress(other.getIsHaveProgress());
                }
                if (other.getCurCoopPoint() != 0) {
                    this.setCurCoopPoint(other.getCurCoopPoint());
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
                CoopDataNotify parsedMessage = null;
                try {
                    parsedMessage = CoopDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CoopDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureChapterListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.chapterList_ = new ArrayList<CoopChapterOuterClass.CoopChapter>(this.chapterList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<CoopChapterOuterClass.CoopChapter> getChapterListList() {
                if (this.chapterListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CoopChapterOuterClass.CoopChapter>)this.chapterList_);
                }
                return this.chapterListBuilder_.getMessageList();
            }
            
            @Override
            public int getChapterListCount() {
                if (this.chapterListBuilder_ == null) {
                    return this.chapterList_.size();
                }
                return this.chapterListBuilder_.getCount();
            }
            
            @Override
            public CoopChapterOuterClass.CoopChapter getChapterList(final int index) {
                if (this.chapterListBuilder_ == null) {
                    return this.chapterList_.get(index);
                }
                return this.chapterListBuilder_.getMessage(index);
            }
            
            public Builder setChapterList(final int index, final CoopChapterOuterClass.CoopChapter value) {
                if (this.chapterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChapterListIsMutable();
                    this.chapterList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setChapterList(final int index, final CoopChapterOuterClass.CoopChapter.Builder builderForValue) {
                if (this.chapterListBuilder_ == null) {
                    this.ensureChapterListIsMutable();
                    this.chapterList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addChapterList(final CoopChapterOuterClass.CoopChapter value) {
                if (this.chapterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChapterListIsMutable();
                    this.chapterList_.add(value);
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addChapterList(final int index, final CoopChapterOuterClass.CoopChapter value) {
                if (this.chapterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureChapterListIsMutable();
                    this.chapterList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addChapterList(final CoopChapterOuterClass.CoopChapter.Builder builderForValue) {
                if (this.chapterListBuilder_ == null) {
                    this.ensureChapterListIsMutable();
                    this.chapterList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addChapterList(final int index, final CoopChapterOuterClass.CoopChapter.Builder builderForValue) {
                if (this.chapterListBuilder_ == null) {
                    this.ensureChapterListIsMutable();
                    this.chapterList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllChapterList(final Iterable<? extends CoopChapterOuterClass.CoopChapter> values) {
                if (this.chapterListBuilder_ == null) {
                    this.ensureChapterListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.chapterList_);
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearChapterList() {
                if (this.chapterListBuilder_ == null) {
                    this.chapterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeChapterList(final int index) {
                if (this.chapterListBuilder_ == null) {
                    this.ensureChapterListIsMutable();
                    this.chapterList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.chapterListBuilder_.remove(index);
                }
                return this;
            }
            
            public CoopChapterOuterClass.CoopChapter.Builder getChapterListBuilder(final int index) {
                return this.getChapterListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CoopChapterOuterClass.CoopChapterOrBuilder getChapterListOrBuilder(final int index) {
                if (this.chapterListBuilder_ == null) {
                    return this.chapterList_.get(index);
                }
                return this.chapterListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CoopChapterOuterClass.CoopChapterOrBuilder> getChapterListOrBuilderList() {
                if (this.chapterListBuilder_ != null) {
                    return this.chapterListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CoopChapterOuterClass.CoopChapterOrBuilder>)this.chapterList_);
            }
            
            public CoopChapterOuterClass.CoopChapter.Builder addChapterListBuilder() {
                return this.getChapterListFieldBuilder().addBuilder(CoopChapterOuterClass.CoopChapter.getDefaultInstance());
            }
            
            public CoopChapterOuterClass.CoopChapter.Builder addChapterListBuilder(final int index) {
                return this.getChapterListFieldBuilder().addBuilder(index, CoopChapterOuterClass.CoopChapter.getDefaultInstance());
            }
            
            public List<CoopChapterOuterClass.CoopChapter.Builder> getChapterListBuilderList() {
                return this.getChapterListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CoopChapterOuterClass.CoopChapter, CoopChapterOuterClass.CoopChapter.Builder, CoopChapterOuterClass.CoopChapterOrBuilder> getChapterListFieldBuilder() {
                if (this.chapterListBuilder_ == null) {
                    this.chapterListBuilder_ = new RepeatedFieldBuilderV3<CoopChapterOuterClass.CoopChapter, CoopChapterOuterClass.CoopChapter.Builder, CoopChapterOuterClass.CoopChapterOrBuilder>(this.chapterList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.chapterList_ = null;
                }
                return this.chapterListBuilder_;
            }
            
            private void ensureViewedChapterListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.viewedChapterList_ = GeneratedMessageV3.mutableCopy(this.viewedChapterList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getViewedChapterListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.viewedChapterList_) : this.viewedChapterList_;
            }
            
            @Override
            public int getViewedChapterListCount() {
                return this.viewedChapterList_.size();
            }
            
            @Override
            public int getViewedChapterList(final int index) {
                return this.viewedChapterList_.getInt(index);
            }
            
            public Builder setViewedChapterList(final int index, final int value) {
                this.ensureViewedChapterListIsMutable();
                this.viewedChapterList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addViewedChapterList(final int value) {
                this.ensureViewedChapterListIsMutable();
                this.viewedChapterList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllViewedChapterList(final Iterable<? extends Integer> values) {
                this.ensureViewedChapterListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.viewedChapterList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearViewedChapterList() {
                this.viewedChapterList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsHaveProgress() {
                return this.isHaveProgress_;
            }
            
            public Builder setIsHaveProgress(final boolean value) {
                this.isHaveProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsHaveProgress() {
                this.isHaveProgress_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurCoopPoint() {
                return this.curCoopPoint_;
            }
            
            public Builder setCurCoopPoint(final int value) {
                this.curCoopPoint_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurCoopPoint() {
                this.curCoopPoint_ = 0;
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
    
    public interface CoopDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<CoopChapterOuterClass.CoopChapter> getChapterListList();
        
        CoopChapterOuterClass.CoopChapter getChapterList(final int p0);
        
        int getChapterListCount();
        
        List<? extends CoopChapterOuterClass.CoopChapterOrBuilder> getChapterListOrBuilderList();
        
        CoopChapterOuterClass.CoopChapterOrBuilder getChapterListOrBuilder(final int p0);
        
        List<Integer> getViewedChapterListList();
        
        int getViewedChapterListCount();
        
        int getViewedChapterList(final int p0);
        
        boolean getIsHaveProgress();
        
        int getCurCoopPoint();
    }
}
